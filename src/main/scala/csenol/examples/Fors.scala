package csenol.examples

object Fors extends App{

  case class Coffee(name: String, id: Int)
  case class Supplier(name: String, id:Int)
  case class Order(cid: Int, sid: Int)


  val coffees = List(Coffee("java", 1), Coffee("turkish",2), Coffee("brazil" , 3))
  val suppliers = List(Supplier("starbucks",1), Supplier("mehmet efendi",2))
  val orders = List(Order(1,1) , Order(3,1), Order(2,2))

  //mehmet efendinin kahveleri
  //sql sorgusu gibi. LINQ tarzi
  val res = 
    for {
    c <- coffees
    s <- suppliers //if (s.name == "mehmet efendi")
    o <- orders //if (o.sid == s.id)
    if(c.id == o.cid && s.id == o.sid && s.name == "mehmet efendi")        
  } yield c.name

  println(res)

  //optimize edersek
  val res2 = 
    for {
    s <- suppliers if (s.name == "mehmet efendi")
    o <- orders if (o.sid == s.id)
    c <- coffees if (o.cid == c.id)
  } yield c.name
  println(res2)

}
