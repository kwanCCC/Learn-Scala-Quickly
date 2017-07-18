package org.doraemon.scala

class BankAccount(init: Double) {

  private var balance = init

  def deposit(amount: Double): Double = {balance += amount; balance}

  def withdraw(amount: Double): Double = {balance -= amount; balance}

}
