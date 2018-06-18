import math._;



object sqrt {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 
	var iterations:Int = 0;System.out.println("""iterations  : Int = """ + $show(iterations ));$skip(44); ;
  println("Welcome to the Scala worksheet");$skip(526); 
  
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
  };System.out.println("""sqrt: (target: Double)Double""");$skip(13); val res$0 = 
  
  sqrt(4);System.out.println("""res0: Double = """ + $show(res$0));$skip(13); val res$1 = 
  iterations;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  sqrt(9);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
  iterations;System.out.println("""res3: Int = """ + $show(res$3));$skip(11); val res$4 = 
  sqrt(16);System.out.println("""res4: Double = """ + $show(res$4));$skip(13); val res$5 = 
  iterations;System.out.println("""res5: Int = """ + $show(res$5));$skip(11); val res$6 = 
  sqrt(81);System.out.println("""res6: Double = """ + $show(res$6));$skip(13); val res$7 = 
  iterations;System.out.println("""res7: Int = """ + $show(res$7));$skip(13); val res$8 = 
  sqrt(0.04);System.out.println("""res8: Double = """ + $show(res$8));$skip(13); val res$9 = 
  iterations;System.out.println("""res9: Int = """ + $show(res$9));$skip(18); val res$10 = 
  sqrt(1024*1024);System.out.println("""res10: Double = """ + $show(res$10));$skip(13); val res$11 = 
  iterations;System.out.println("""res11: Int = """ + $show(res$11));$skip(23); val res$12 = 
  sqrt(1024*1024*1024);System.out.println("""res12: Double = """ + $show(res$12));$skip(13); val res$13 = 
  iterations;System.out.println("""res13: Int = """ + $show(res$13));$skip(25); val res$14 = 
  sqrt(math.pow(40, 40));System.out.println("""res14: Double = """ + $show(res$14));$skip(13); val res$15 = 
  iterations;System.out.println("""res15: Int = """ + $show(res$15));$skip(13); val res$16 = 
  sqrt(1e50);System.out.println("""res16: Double = """ + $show(res$16));$skip(13); val res$17 = 
  iterations;System.out.println("""res17: Int = """ + $show(res$17));$skip(16); val res$18 = 
  sqrt(1.0e-20);System.out.println("""res18: Double = """ + $show(res$18));$skip(13); val res$19 = 
  iterations;System.out.println("""res19: Int = """ + $show(res$19))}
}
