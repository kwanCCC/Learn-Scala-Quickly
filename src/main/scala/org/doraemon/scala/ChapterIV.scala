package org.doraemon.scala

import scala.collection.JavaConverters.propertiesAsScalaMap
import scala.collection.mutable
import scala.io.Source

class ChapterIV {

  def test() = {
    val map = Map("cup" -> 10, "book" -> 30, "Macbook Pro" -> 99800, "iPad" -> 3200)
    for ((k, v) <- map) yield {
      (k, v * 0.9)
    }
  }

  def readFile() = {
    val source = Source.fromFile("myfile.txt").mkString // 将文件读取为字符串
    val tokens = source.split("\\s+") // 用正则表达式来分割字符（这里是空格、tab键、分行等）
    val map = new mutable.HashMap[String, Int]

    for (key <- tokens) {
      map(key) = map.getOrElse(key, 0) + 1 // 用 getOrElse 来加入新的元素或加1
    }

    println(map.mkString(",")) // 用","来作为打印map中元素的分隔符
  }

  def system() = {
    val props: scala.collection.Map[String, String] = {
      propertiesAsScalaMap(System.getProperties)
    }
    val keys = props.keySet
    val keyLengths = for (key <- keys) yield {
      key.length
    }
    val maxKeyLength = keyLengths.max

    for (key <- keys) {
      print(key)
      print(" " * (maxKeyLength - key.length))
      print(" | ")
      println(props(key))
    }
  }

  def minmax(array: Array[Int]) = {
    (array.min, array.max)
  }

  def Iteqgt(values: Array[Int], v: Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }


  def zipString() = {
    println("Hello".zip("World"))
  }

  def main(args: Array[String]): Unit = {

  }
}
