package controllers

import play.api.Logger
import play.api.mvc.{Controller, Action}

class UserController extends Controller {

  val log = Logger(this.getClass())

  def renderUser = Action {
    log.debug("this is a debug message from the user controller")
    Ok("Render user")
  }
}
