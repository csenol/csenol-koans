package csenol.koans

import support.KoanSuite
class Csenol2Functions extends KoanSuite {

  val lon = List(1, 2, 3, 4, 5)

  koan("high-order functionlar ilk örnek benden") {
    def toplama(a: Int, b: Int) = a + b
    val total1 = lon.foldRight(0)(toplama)
    total1 should be(15)
  }
  koan("anonim/lambda function kullanarak. type-inference olmadan") {
    val total2 = lon.foldRight(0)(???)
    total2 should be(__)
  }

  koan("anonim/lambda function kullanarak. type-inference ile") {
    val total3 = lon.foldRight(0)(???)
    total3 should be(15)
  }

  koan(" underscore kullnarak") {
    val total4 = lon.foldRight(0)(???)
    total4 should be(15)
  }
}
