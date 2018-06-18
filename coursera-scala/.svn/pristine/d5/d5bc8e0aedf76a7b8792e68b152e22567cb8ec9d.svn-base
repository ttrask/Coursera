package Week_1

object Lecture_15 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(410); 

  def sqrt(x: Double) = {

    def abs(x: Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < (0.01)

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0);
  };System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 

  sqrt(16);System.out.println("""res2: Double = """ + $show(res$2));$skip(15); val res$3 = 

  sqrt(0.01);System.out.println("""res3: Double = """ + $show(res$3));$skip(15); val res$4 = 

  sqrt(1e60);System.out.println("""res4: Double = """ + $show(res$4));$skip(20); 

  val x: Int = 2;System.out.println("""x  : Int = """ + $show(x ));$skip(27); ;
  val y: Int = (x
    +x);;System.out.println("""y  : Int = """ + $show(y ))}

}