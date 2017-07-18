package org.doraemon.scala.mark

class Student {
  var age: Int = 0

}

object Test extends App {
  val student = new Student
  println(student.age)
  student.age = 1
  println(student.age)
}