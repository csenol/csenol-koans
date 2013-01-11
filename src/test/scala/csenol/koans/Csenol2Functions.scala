package csenol.koans

import support.KoanSuite
class Csenol2Functions extends KoanSuite {

  val lon = List(1, 2, 3, 4, 5)

  koan("high-order functionlar ilk örnek benden filter") {
    def cift(a: Int) = (a % 2) == 0
    val res1 = lon.filter(cift)
    res1 should not contain (1)
    res1 should not contain (???)
    res1 should contain (2)
    res1 should contain (???)
    
  }
  koan("anonim/lambda function kullanarak. type-inference olmadan") {
    val res1 = lon.filter(???)
    res1 should not contain (1)
    res1 should not contain (???)
    res1 should contain (2)
    res1 should contain (???)
  }

  koan("anonim/lambda function kullanarak. type-inference ile") {
    val res1 = lon.filter(???)
    res1 should not contain (1)
    res1 should not contain (???)
    res1 should contain (2)
    res1 should contain (???)
  }

  koan(" underscore kullnarak") {
    val res1 = lon.filter(???)
    res1 should not contain (1)
    res1 should not contain (???)
    res1 should contain (2)
    res1 should contain (???)
  }



  koan("2 parametre alan high-order-functionlar icin ilk ornek yine benden") {
    def toplama(a: Int, b: Int) = a + b
    val total1 = lon.foldRight(0)(toplama)
    total1 should be(15)
  }
  koan("2 parametreli anonim/lambda function kullanarak. type-inference olmadan") {
    val total2 = lon.foldRight(0)(???)
    total2 should be(__)
  }

  koan("2 parametreli anonim/lambda function kullanarak. type-inference ile") {
    val total3 = lon.foldRight(0)(???)
    total3 should be(15)
  }

  koan("2 parametreli  underscore kullnarak") {
    val total4 = lon.foldRight(0)(???)
    total4 should be(15)
  }
}
