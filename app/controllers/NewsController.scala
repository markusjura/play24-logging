package controllers

import play.api._
import play.api.mvc._

class NewsController extends Controller {

  val log = Logger("c.NewsController")

  def renderNews = Action {
    Logger.debug("This is a debug message from the news controller.")

    Ok("Render news")
  }
}