package org.doraemon.scala

class ChapterV {

}

class Counter {
  private var value = 0

  def increment(): Unit = {
    value = if (value < Int.MaxValue) value + 1 else value
  }

  def current() = value
}

class BankAccount {
  val balance = ()

  def deposit(): Unit = {}

  def withdraw(): Unit = {}
}

class Timer(val hours: Int, val minutes: Int) {
  def before(other: Timer): Boolean = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }

  override def toString: String = hours + ":" + minutes
}

class TimeSec(val hours: Int, val minutes: Int) {
  def before(other: Timer): Boolean = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }

  override def toString: String = hours * 60 + ":" + minutes
}

class Person(var age: Int = 0, val name: String) {
  age = if (age < 0) 0 else age
  val firstName = name.split(" ").head
  val lastName  = name.split(" ").last
}


