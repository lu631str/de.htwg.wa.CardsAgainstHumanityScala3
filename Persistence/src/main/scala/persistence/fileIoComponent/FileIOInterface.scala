package persistence.fileIoComponent

import scala.util.Try

trait FileIOInterface {
  def load(): Try[String]

  def save(game: String): Try[Unit]
}
