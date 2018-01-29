package controllers

import javax.inject.{Inject, Singleton}

import org.webjars.play.WebJarsUtil
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class ScapigController @Inject()(cc: ControllerComponents)(implicit webJarsUtil: WebJarsUtil, assets: AssetsFinder) extends AbstractController(cc) {

  def root() = Action.async { implicit request =>
    Future(Ok(views.html.index()))
  }

  def apiPublisherHowTo() = Action.async { implicit request =>
    Future(Ok(views.html.publisher.howto()))
  }

  def apiPublisherRaml() = Action.async { implicit request =>
    Future(Ok(views.html.publisher.raml()))
  }

  def developerHub() = Action.async { implicit request =>
    Future(Ok(views.html.hub()))
  }

  def apiGatewayAuthorization() = Action.async { implicit request =>
    Future(Ok(views.html.apiGateway.authorization()))
  }

  def architectureComponents() = Action.async { implicit request =>
    Future(Ok(views.html.architecture.components()))
  }

  def architectureDiagrams() = Action.async { implicit request =>
    Future(Ok(views.html.architecture.diagrams()))
  }

  def getStarted() = Action.async { implicit request =>
    Future(Ok(views.html.getStarted()))
  }

  def apiGatewayApiAccess() = Action.async { implicit request =>
    Future(Ok(views.html.apiGateway.apiAccess()))
  }

  def apiGatewaySandbox() = Action.async { implicit request =>
    Future(Ok(views.html.apiGateway.sandbox()))
  }
}
