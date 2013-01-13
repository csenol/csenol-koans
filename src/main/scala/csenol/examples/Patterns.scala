package csenol.examples

object Patterns extends App {

  abstract class Expr
//  sealed abstract class Expr
  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String,
		   left: Expr, right: Expr) extends Expr

  // match not exhaustive
  // UnOp u BinOp u atladin diyor
  def describe(e: Expr): String = e match {
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }

  val expr = BinOp("+", 
		   UnOp("-", Number(3)),
		   Number(45))
  
  val example:Any = null

  //Pattern Matching
  //Javadaki switch in gelişmişi.
  //Fp nin vazgeçilmezlerinden
  val res = example match {
    case BinOp("+", e, Number(0)) => println("a deep match")
    //Consturctor Pattern
    case List(0, _, _) => println("found it") 
    //Sequence Pattern. 3elemanli liste 0 ile balyor
    case List(0, _*) => println("found it") 
    //O ile başlıyor devam olabilir de olmayabilir de
    case (a, b, c) => println("matched "+ a + b + c) 
    //tuple pattern
    case s: String => s.length 
    // Sadece tip elemesi de yeterli olabiliyor
    case m: Map[Int, Int] => true   
    //çalışmyor Type-Erasure sebebiyle. Manifest kullanmak lazım. Sonra bakacağız.
    case m: Map[_, _] => m.size 
    // Tipe bakmadan
    case UnOp("abs", e @ UnOp("abs", _)) => e 
    //Variable binding. Constructor Pattern de yakaladigim şeyi kullanmak istiyorum. 
    //İçi içe matching aslında
    case _ =>  "default"
  }

  println(res)


}
