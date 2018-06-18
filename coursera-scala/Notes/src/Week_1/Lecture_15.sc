package Week_1

object Lecture_14 {

  1 + 2                                           //> res0: Int(3) = 3
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  abs(2)                                          //> res1: Double = 2.0

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double): Boolean =
    abs(guess * guess - x)/x < (0.01)             //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res2: Double = 1.4166666666666665
  sqrt(4)                                         //> res3: Double = 2.000609756097561

  sqrt(16)                                        //> res4: Double = 4.002257524798522
  
  sqrt(0.01)                                      //> res5: Double = 0.10032578510960605
  
  sqrt(1e60)                                      //> res6: Double = 1.0000788456669446E30
}