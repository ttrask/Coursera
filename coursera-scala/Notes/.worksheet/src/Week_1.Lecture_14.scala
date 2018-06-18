package Week_1

object Lecture_14 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(46); val res$0 = 

  1 + 2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(44); 
  println("Welcome to the Scala worksheet");$skip(46); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(11); val res$1 = 

  abs(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(131); 

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(96); 

  def isGoodEnough(guess: Double, x: Double): Boolean =
    abs(guess * guess - x)/x < (0.01);System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(72); 

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(43); 

  def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$2 = 

  sqrt(2);System.out.println("""res2: Double = """ + $show(res$2));$skip(10); val res$3 = 
  sqrt(4);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 

  sqrt(16);System.out.println("""res4: Double = """ + $show(res$4));$skip(16); val res$5 = 
  
  sqrt(0.01);System.out.println("""res5: Double = """ + $show(res$5));$skip(16); val res$6 = 
  
  sqrt(1e60);System.out.println("""res6: Double = """ + $show(res$6))}
}