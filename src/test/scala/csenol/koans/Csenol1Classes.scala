package csenol.koans

import support.KoanSuite
class Csenol1Classes  extends KoanSuite {
  class Complex(val real: Int, val imaginary: Int){
    //toplama
    def +(that: ***): ??? = ???
    //cikarma
    def -(that: ***): ??? = ???

    def this(a: Int) = this(a, 0)
    //to string

  }
 koan("complex sayilar toplanabilmeli") {
  val x:Complex = ???
  val y:Complex = ???
  val sum:Complex  = x + y
  sum.real should be (__)
  sum.imaginary should be (__)
 }


  koan("complex sayılar çıkartılabilmeli") {
    val x:Complex = ???
    val y:Complex = ???
    val diff:Complex  = x - y
    diff.real should be (__)
    diff.imaginary should be (__)
  }

}
