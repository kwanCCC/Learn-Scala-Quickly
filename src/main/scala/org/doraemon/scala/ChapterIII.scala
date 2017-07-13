package org.doraemon.scala

import java.util.TimeZone

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class ChapterIII {

  def makerArr(n: Int) = {
    val a = new Array[Int](n)
    for (_ <- a) yield {
      Random.nextInt(n)
    }
  }

  def exchange(array: Array[Int]) = {
    for (i <- 0 until(array.length - 1, 2)) {
      val t = array(i)
      array(i) = array(i + 1)
      array(i + 1) = t
    }
  }

  def exchangeAndMake(array: Array[Int]) = {
    for (i <- 0 until array.length) yield {
      {
        if (i < (array.length - 1) && i % 2 == 0) array(i + 1)
        else if (i < (array.length - 1) && i % 2 == 1) array(i - 1)
        else array(i)
      }
    }
  }

  def reSort(array: Array[Int]) = {
    val buf = ArrayBuffer[Int]()
    buf ++= (for (i <- array if i > 0) yield {
      i
    })
    buf ++= (for (i <- array if i == 0) yield {
      i
    })
    buf ++= (for (i <- array if i < 0) yield {
      i
    })

    buf.toArray
  }

  def avg(array: Array[Int]) = {
    val res = array.sum / array.length
    println(res)
  }

  def resverse(arr: Array[Int]) = {
    for (i <- 0 until (arr.length / 2)) {
      val t = arr(i)
      arr(i) = arr(arr.length - 1 - i)
      arr(arr.length - 1 - i) = t
    }
  }

  def resverse(array: ArrayBuffer[Int]) = {
    array.reverse
  }

  def distinct(array: Array[Int]) = {
    array.distinct.toString
  }

  def test() = {
    TimeZone.getAvailableIDs.filter(_.startsWith("America")).foreach(_.drop("America/".length));
  }
}
