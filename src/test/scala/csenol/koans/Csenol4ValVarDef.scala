package csenol.koans

import support.KoanSuite
class Csenol4ValVarDef extends KoanSuite {

  var x = 0
  val e: Int = {
    println("hello val")
    x = x + 1
    1
  }

  lazy val d: Int = {
    println("hello bezgin bekir")
    x = x + 1
    4
  }

  var b: Int = {
    println("hello var")
    x = x + 1
    2
  }

  def c: Int = {
    println("hello def")
    x = x + 1
    3
  }

  koan("val var def anladik mi ?") {
    println(e)
    x should be(__)
    println(e)
    x should be(__)
    println(b)
    x should be(__)
    println(b)
    x should be(__)
    println(c)
    x should be(__)
    println(c)
    x should be(__)
    println(d)
    x should be(__)
    println(d)
    x should be(__)
  }
}
