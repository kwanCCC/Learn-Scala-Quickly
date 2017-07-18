package org.doraemon.scala

class Checking(init: Double) extends BankAccount(init) {
  override def deposit(amount: Double): Double = super.deposit(amount) - 1

  override def withdraw(amount: Double): Double = super.withdraw(amount) - 1
}
