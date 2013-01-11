package csenol.examples

object Functions extends App{

  val lon = List(1,2,3,4,5)
  val myMap = Map(1-> "ali", 2->"veli")
  val aon = Array(1,2,3,4,5)
  val von = Vector(1,2,3,4,5)

  var lon2 = List[Int]()
  

  //londaki sayilari bir artirilmis halini kullanmak
  
  //yontem 1. Java kafasi
  for(i <- 0 to lon.size){
    lon2 = lon2 :+ (1 + lon(i)) 
  }
  
  //2. java kafasi
  for(i <- lon){
    lon2 = lon2 :+ (1 +i) 
  }

  //for comprehenssion. Python kafasi
  lon2 = for(i <- lon) yield i+1
  
  //1 ekleyen bir fonskiyonumuz olsun
  def add1(a: Int) = a + 1
  val add1F = (a:Int) => a + 1
  
  //FP-Java kafasi
  lon2 = lon.map(add1)

  //fonskyion tanimlamayalim ayrica.
  //add1 i on-the-fly tanimlayalim
  lon2 = lon.map((x:Int) => x + 1)

  //Type inference var. Hafif Scala kafasi
  lon2 = lon.map(x => x + 1)

  //Yahu x de tekrar ediyor. Ondan da kurtulsak?
  //Scala kafasi
  lon2 = lon.map(_ + 1)
  
  //closure da yapabilriz
  val k = 3
  lon2 = lon.map(_ + k)

  //acarsak
  def addx(a:Int) = a + k
  lon2 = lon.map(addx)
  
  var sum = 0
  //closure. Java8 de olmuyor
  lon.foreach(x => sum = sum + x)
  println(sum)

  def add1MulX(a:Int, m:Int) = a*m +1

  //partial application
  lon.map(add1MulX(_ , 10))
  
  //function returns function
  def add1MulX2(m: Int) = (a:Int) => a*m + 1
  lon.map(add1MulX2(10))
  

  //currying. yukaridaki isi otomatik yaptirdi bize
  def add1MulX3(m:Int)(a:Int) = a*m + 1
  lon.map(add1MulX3(10))

}
