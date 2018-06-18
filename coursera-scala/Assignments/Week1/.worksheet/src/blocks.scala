object blocks {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet");$skip(15); 
  
  val x = 0;System.out.println("""x  : Int = """ + $show(x ));$skip(24); 
  
  def f(y:Int) = y+1;System.out.println("""f: (y: Int)Int""");$skip(42); 
  val result = {
  	val  x= f(4); x*x} +x;System.out.println("""result  : Int = """ + $show(result ))}
}
