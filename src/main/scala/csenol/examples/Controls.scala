package csenol.examples

object Controls extends App{
  
  
  //currying ve high-order functionlar sayesinde kendi kotnrol yapilarimizi
  // tanimlayabiliriz


  def boolAssert(predicate: Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
  boolAssert(5 > 3)
  assertionsEnabled = false
  //assertion kapali olsa da error alacagiz
  //cunku parametre fonksiyona verilirken evaluate edilecek
  //myAssert((5 / 0) == 0)


def myAssert(predicate: () => Boolean) =
  if (assertionsEnabled && !predicate())
    throw new AssertionError
  
  //simdi parametre yerine fonksiyon veriyoruz.
  //fonksiyon parametre almiyor ama Boolean uretiyor
  //javascript - scheme kafasi
  assertionsEnabled = false
  myAssert(()=> 5/0 == 0)

  //simdi sroun yok ama cagirirken kotu gozukuyor
  
  //by-name parameter kullaniyoruz.
  //lazy val gibi ama parametre de kullanilan cinsi
  // parametre lazim olmadikca calistirilmiyor
  var assertionsEnabled = true
  def byNameAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
  assertionsEnabled = false
  byNameAssert(5/0 == 0)
  //elegant...
  

//DAHASI DA VAR


/*
  //hatalisi
  def until(b: Boolean)(f: () => Unit):Unit = {
    if(!b){
      f()
      until(b)(f)
    }
  }
  
  var x = 0
  var y = 5
  //suslu parantez actik parametre yerine
  until( x > y){ //() => 
    x = x+1
    println(x)		
  }

*/

  
  //dogrusu
  def until(b: => Boolean)(f: => Unit):Unit = {
    if(!b){
      f
      until(b)(f)
    }
  }
  
  var x = 0
  var y = 5
  //suslu parantez actik parametre yerine
  until( x > y){
    x = x+1
    println(x)		
  }
  
  
}
