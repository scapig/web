package controllers

import javax.inject.{Inject, Singleton}

import org.webjars.play.WebJarsUtil
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class ScapigController @Inject()(cc: ControllerComponents)(implicit webJarsUtil: WebJarsUtil) extends AbstractController(cc) {

  def root() = Action.async { implicit request =>
    Future(Ok(views.html.index()))
  }
}
