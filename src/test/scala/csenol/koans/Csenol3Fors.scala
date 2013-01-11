package csenol.koans

import support.KoanSuite
class Csenol3Fors extends KoanSuite {

  case class Coffee(name: String, id: Int)

  case class Supplier(name: String, id: Int)

  case class Order(cid: Int, sid: Int)

  case class Person(name: String, id: Int)

  case class Owned(sid: Int, pid: Int)

  val coffees = List(Coffee("java", 1), Coffee("turkish", 2), Coffee("brazil", 3))
  val suppliers = List(Supplier("starbucks", 1), Supplier("kurukahveci mahdunları", 2))
  val orders = List(Order(1, 1), Order(3, 1), Order(2, 2), Order(3, 2))
  val people = List(Person("Kara Thrace", 1), Person("Mehmet Efendi", 2))
  val owners = List(Owned(1, 1), Owned(2, 2))

  koan("Mehmet Efendinin kahveleri nelerdir") {
    val result: List[String] = ???
    result should contain("turkish")
    result should contain("brazil")
  }

  koan("Kara da olup Mehmet Efendi de olmayan Kahveler Nelerdir") {
    val result: List[String] = ???
    result should contain("java")
    result should not contain("brazil")
  }


}
