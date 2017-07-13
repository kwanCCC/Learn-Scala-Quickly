package org.doraemon.scala

import java.awt.Point
import java.awt.geom.Ellipse2D

class ChapterVI {

}

trait RectangleLike {
  this: Ellipse2D.Double =>

  def translate(x: Double, y: Double) {
    this.x = x
    this.y = y
  }

  def grow(x: Double, y: Double) {
    this.x += x
    this.y += y
  }
}

class OrderedPoint extends Point with Ordered[Point] {
  override def compare(that: Point): Int = {
    if (this.x <= that.x && this.y < that.y) -1
    else if (this.x == that.x && this.y == that.y) 0
    else 1
  }
}


object Test extends App {
  val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  println("x = " + egg.getX + " y = " + egg.getY)
  egg.translate(10, -10)
  println("x = " + egg.getX + " y = " + egg.getY)
  egg.grow(10, 20)
  println("x = " + egg.getX + " y = " + egg.getY)

}