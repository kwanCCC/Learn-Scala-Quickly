package org.doraemon.scala

class TestConsole {

}

object TestConsole extends App {
  val a = ObjectSingle.apply
  implicit
  val b = ObjectSingle.apply
  a.nameIt("a")
  b.nameIt("b")
  println(s"a.equal(b)=${a.equals(b)}")
  println(s"a.equal(b)=${a == b}")
  println(s"a.equal(b)=${a.eq(b)}")
  println(ChapterIX.unapply(null).getOrElse("2").asInstanceOf[Tuple2[String, String]]._1)
}

