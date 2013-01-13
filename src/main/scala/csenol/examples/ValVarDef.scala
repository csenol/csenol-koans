package csenol.examples

object ValVarDef extends App {

  //her sey expression
  // blocklar expression ve deger uretiyorlar.
  //urettikleri degerler de en son da yazan expressionlar
  // val x = 3 gibi bir seyle bitiyorsa Unit uretiyor
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


  //nested scope ile tail-call optimization
  def factorial(a:Int) = {
    import scala.annotation.tailrec    
    @tailrec
    def factorialTail(a:Int, acc:Int):Int = 
      if(a <= 0) acc else factorialTail(a-1, acc*a) 
    factorialTail(a,1)
  }
  
  // valx=4 factorial(x) yazmak yerine bunu factorial i calistirirken yapabiliriz
  val res = factorial {
    val x = 4
    println(x)
    x
  }
  println(res)
  //yerli yerinde kullaniriz herseyi. x baska bi scope da lazim değil nasil olsa.
  // function i call ettitkten sonra x heap'de stack da tutmaya gerek yok. 
}
