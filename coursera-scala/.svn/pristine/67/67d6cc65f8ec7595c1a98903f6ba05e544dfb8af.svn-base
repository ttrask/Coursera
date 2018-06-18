package Week_1

object Lecture_15 {

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
  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4166666666666665
  sqrt(4)                                         //> res1: Double = 2.000609756097561

  sqrt(16)                                        //> res2: Double = 4.002257524798522

  sqrt(0.01)                                      //> res3: Double = 0.10032578510960605

  sqrt(1e60)                                      //> res4: Double = 1.0000788456669446E30

  val x: Int = 2;                                 //> x  : Int = 2
  val y: Int = (x
    +x);                                          //> y  : Int = 4

}