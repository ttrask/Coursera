object blocks {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = 0                                       //> x  : Int = 0
  
  def f(y:Int) = y+1                              //> f: (y: Int)Int
  val result = {
  	val  x= f(4); x*x} +x                     //> result  : Int = 25
}