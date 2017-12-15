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

  def api() = Action.async { implicit request =>
    Future(Ok(views.html.api()))
  }

  def application() = Action.async { implicit request =>
    Future(Ok(views.html.application()))
  }

  def authorization() = Action.async { implicit request =>
    Future(Ok(views.html.authorization()))
  }

  def developerHub() = Action.async { implicit request =>
    Future(Ok(views.html.developerHub()))
  }

  def gateway() = Action.async { implicit request =>
    Future(Ok(views.html.gateway()))
  }

  def publisher() = Action.async { implicit request =>
    Future(Ok(views.html.publisher()))
  }

  def architecture() = Action.async { implicit request =>
    Future(Ok(views.html.architecture()))
  }

  def getStarted() = Action.async { implicit request =>
    Future(Ok(views.html.getStarted()))
  }

}
