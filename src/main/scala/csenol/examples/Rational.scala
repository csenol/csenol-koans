package csenol.examples


class Rational(n: Int, d: Int) {
  import Rational._
   // post-condition. run-time
  require(d != 0)
  // private
  private val g = gcd(n.abs, d.abs)
  //Semicolon ve Type Inference
  //val Javadaki final gibi. Immutability i teşvik eden bişi.
  val numer = n / g ; val denom = d / g 
  // auxilary-constructor
  def this(n: Int) = this(n, 1)
  //method tanimi. method ismi symbol. infix operator. Aslinda bir method
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  //method return-type inference
  def * (that: Rational) =
    new Rational(numer * that.numer, denom * that.denom)

  //override ediyorsa override yazmak zorundayiz. aksi halde compile error
  override def toString = numer +"/"+ denom 
}


//static methodlar ve fieldler buraya.
//signleton class gibi.
//companion object deniyor. 
//ayni isimle ayni dosyada olacak.

object Rational {
  //bu priavte ama companion objectdekileri Class gorebiliyor.
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  val magic = new Rational(42)

  //Factory method. Double dan Rational uretiyoruz
  def apply(d: Double): Rational = 
    new Rational (d.intValue * 100 + (d%1*100).intValue, 100) 
}


//main function yerine main object yazabiliriz. daha kolay
//main function da var. isteyen kullanabilir
object Main extends App{
  val a = new Rational(5)
  val b = new Rational(5,3)
  val sum = a + b
  //yukaridaki ile ayni
  val sum2 = a.+(b)
  println(sum)
  println(sum2)

  //compile hatasi
  //a = b

  //semicolon ve var ornegi
  //type yazabailiriz emin olmak icin
  var c:Rational = new Rational(22,7) ; c = b

  //factory method kullanimi
  //val r = Rational.apply(1.18)
  //asagidaki ayni
  //bu bir method call. o yuzden new yazmiyoruz
  val r = Rational(1.18)
  println(r)

}
