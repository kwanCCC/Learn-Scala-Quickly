package org.doraemon.scala

import scala.util.Random

class ChapterII {
  def matchNum(num: Number) = {
    num match {
      case _ if num.longValue() > 0 => println(1)
      case _ if num.longValue() < 0 => println(-1)
      case _ if num.longValue() == 0 => println(0)
    }
  }

  def unitType() = {
    val unit: Unit = {}
    println(unit.getClass.toString)
  }

  def equalEqual() = {
    var x = ()
    var y = 1
    x = y = 1
  }

  def scalaFor() = {
    for (i <- 0 to 10 reverse) {
      println(i)
    }
  }

  def countDown(n: Int) = {
    for (i <- n to 0) {
      println(i)
    }
  }

  def unicode_product(s: String) = {
    var res = 1L
    for (ch <- s) {
      res *= ch.toLong
    }
    println(res)
  }

  def use_stringOps(s: String) = {
    var res = 1L
    s.foreach(res *= _)
  }

  def product(s: String): Long = {
    if (s.length == 1) s.head
    else s.head * product(s.drop(1))
  }

  def myPow(x: Int, n: Int): Double = {
    if (n == 0) 1
    else if (n > 0 && n % 2 == 0) myPow(x, n / 2) * myPow(x, n / 2)
    else if (n > 0 && n % 2 == 1) x * myPow(x, n - 1)
    else 1 / myPow(x, -n)
  }

  def apply: ChapterII = new ChapterII()

  def main(args: Array[String]): Unit = {
    val chapterII = ChapterII.this.apply;
    println(chapterII.myPow(2, 6))
    println(chapterII.product("asdff"))
    println(chapterII.use_stringOps("asdff"))
    println(chapterII.unicode_product("asdff"))
    println(chapterII.countDown(10))
    println(chapterII.scalaFor())
    println(chapterII.equalEqual())
    println(chapterII.unitType())
    println(chapterII.matchNum(Random.nextInt()))
  }

}
