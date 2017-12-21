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

  def apiPublisherLifecycle() = Action.async { implicit request =>
    Future(Ok(views.html.publisher.apiLifecycle()))
  }

  def developerHubApiDocumentation() = Action.async { implicit request =>
    Future(Ok(views.html.developerHub.apiDocumentation()))
  }

  def developerHubApplication() = Action.async { implicit request =>
    Future(Ok(views.html.developerHub.application()))
  }

  def apiGatewayRouting() = Action.async { implicit request =>
    Future(Ok(views.html.apiGateway.routing()))
  }

  def apiGatewayAuthorization() = Action.async { implicit request =>
    Future(Ok(views.html.apiGateway.authorization()))
  }

  def architectureComponents() = Action.async { implicit request =>
    Future(Ok(views.html.architecture.components()))
  }

  def architectureDiagram() = Action.async { implicit request =>
    Future(Ok(views.html.architecture.diagram()))
  }

  def getStartedInstall() = Action.async { implicit request =>
    Future(Ok(views.html.getStarted.install()))
  }

  def getStartedCreateApplication() = Action.async { implicit request =>
    Future(Ok(views.html.getStarted.createApplication()))
  }

  def getStartedPublishApi() = Action.async { implicit request =>
    Future(Ok(views.html.getStarted.publishApi()))
  }

  def getStartedApplicationEndpoint() = Action.async { implicit request =>
    Future(Ok(views.html.getStarted.applicationEndpoint()))
  }

  def getStartedUserEndpoint() = Action.async { implicit request =>
    Future(Ok(views.html.getStarted.userEndpoint()))
  }

}
