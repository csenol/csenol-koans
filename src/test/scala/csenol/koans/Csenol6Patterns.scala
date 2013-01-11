
package csenol.koans

import support.KoanSuite



object Csenol6Patterns extends KoanSuite {

  sealed abstract class Expression
  
  case class Number(value : Int) extends Expression
  case class Add(lhs : Expression, rhs : Expression) extends Expression
  case class Sub(lhs : Expression, rhs : Expression) extends Expression
  case class Neg(hs:Expression) extends Expression
  
  //SICP Eval
  //Apply sonra
  koan("Eval yaziyoruz. Pattern mathcing ve case class ile"){
    def eval(expr: Expression):Int = ???
    
    val n2 = Number(2)
    val add = Add(Number(20), Number(20))
    val sub = Sub(Number(0), Neg(Number(4)))
    
    eval{
      val a1 = Add(add, sub)
      Sub(a1, n2)
    } should be (__) 
  }


}
