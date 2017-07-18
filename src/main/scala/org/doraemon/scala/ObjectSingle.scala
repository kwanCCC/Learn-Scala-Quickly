package org.doraemon.scala

class ObjectSingle {
  private var name: String = "";

  def nameIt(name: String) = {
    this.name = name
  }
}

object ObjectSingle {
  val objectSinglet = new ObjectSingle

  def apply: ObjectSingle = objectSinglet
}