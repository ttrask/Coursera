import math._;



object sqrt {
	var iterations:Int = 0;                   //> iterations  : Int = 0
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sqrt(target:Double) = {
  	val start = 1;
  	iterations = 0;
  	
  	//iteratively improve sqrt
  	def iterate(mean:Double):Double = {
  		//performance counter for recurse
  		iterations+=1;
  		//evaluate new target mean.
  		val newTarget = ((target/mean)+mean)/2;
			//determine if the new target is good enough
  	 if(abs((mean-newTarget)/mean) < 1e-50)
  	 		return newTarget;
  	 else{
  	 		//if not, use the new target to iterate again.
  	 		return iterate(newTarget);
  	 	}
  	}
  	
  	iterate(start);
  }                                               //> sqrt: (target: Double)Double
  
  sqrt(4)                                         //> res0: Double = 2.0
  iterations                                      //> res1: Int = 7
  sqrt(9)                                         //> res2: Double = 3.0
  iterations                                      //> res3: Int = 7
  sqrt(16)                                        //> res4: Double = 4.0
  iterations                                      //> res5: Int = 8
  sqrt(81)                                        //> res6: Double = 9.0
  iterations                                      //> res7: Int = 9
  sqrt(0.04)                                      //> res8: Double = 0.2
  iterations                                      //> res9: Int = 8
  sqrt(1024*1024)                                 //> res10: Double = 1024.0
  iterations                                      //> res11: Int = 16
  sqrt(1024*1024*1024)                            //> res12: Double = 32768.0
  iterations                                      //> res13: Int = 21
  sqrt(math.pow(40, 40))                          //> res14: Double = 1.099511627776E32
  iterations                                      //> res15: Int = 112
  sqrt(1e50)                                      //> res16: Double = 1.0E25
  iterations                                      //> res17: Int = 89
  sqrt(1.0e-20)                                   //> res18: Double = 9.999999999999999E-11
  iterations                                      //> res19: Int = 39
}