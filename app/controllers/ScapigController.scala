package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class ScapigController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def root() = Action.async { implicit request =>
    Future(Ok(views.html.index()))
  }
}
