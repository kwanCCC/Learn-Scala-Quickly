package org.doraemon.scala

class ChapterIX {


}

object ChapterIX {
  def unapply(arg: ChapterIX): Option[Any] = {
    Some("1", "2")
  }
}
