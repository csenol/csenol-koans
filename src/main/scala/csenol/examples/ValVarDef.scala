package csenol.examples

object ValVarDef extends App {

  val a:Int = {
    println("hello val")
    1
  }

  var b:Int = {
    println("hello var")
    2
  }

  def c:Int = {
    println("hello def")
    3 
  }

  lazy val d:Int = {
    println("hello bezgin bekir")
    4
  }
  
  println(a)
  println(a)
  println(b)
  println(b)
  println(c)
  println(c)
  println(d)
  println(d)


  //nested scope ile tail-recusion optimization
  def factorial(a:Int) = {
    import scala.annotation.tailrec    
    @tailrec
    def factorialTail(a:Int, acc:Int):Int = 
      if(a <= 0) acc else factorialTail(a-1, acc*a) 
    factorialTail(a,1)
  }
  
  val res = factorial {
    val x = 4
    println(x)
    x
  }
  println(res)

}
