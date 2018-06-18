package Week1

object balance {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def balance(chars: List[Char]): Boolean = {
  	var indent = 0;
  	
  	def checkIndent(chars: List[Char], i:Int): Boolean = {
  		println(chars.mkString("")+ " "+ indent);
  		if(!chars.isEmpty){
  		if(chars.head == '('){
  			indent=i +1;
  		}
  		else if(chars.head == ')')
  			{indent=i-1;}
  			
  		}
  		if(indent>=0){
  			if(!chars.isEmpty){
  				return checkIndent(chars.tail: List[Char], indent)
  			}
  			else{
  				if(indent>0){
  				return false
  				}
  				else{
  				return true;
  				}
  			}
  		}
  		else{
  		 return false
  		}
  		
  		
  	}
  	return checkIndent(chars, 0)
  }                                               //> balance: (chars: List[Char])Boolean
	
	balance("(if (zero? x) max (/ 1 x))".toList)
                                                  //> (if (zero? x) max (/ 1 x)) 0
                                                  //| if (zero? x) max (/ 1 x)) 1
                                                  //| f (zero? x) max (/ 1 x)) 1
                                                  //|  (zero? x) max (/ 1 x)) 1
                                                  //| (zero? x) max (/ 1 x)) 1
                                                  //| zero? x) max (/ 1 x)) 2
                                                  //| ero? x) max (/ 1 x)) 2
                                                  //| ro? x) max (/ 1 x)) 2
                                                  //| o? x) max (/ 1 x)) 2
                                                  //| ? x) max (/ 1 x)) 2
                                                  //|  x) max (/ 1 x)) 2
                                                  //| x) max (/ 1 x)) 2
                                                  //| ) max (/ 1 x)) 2
                                                  //|  max (/ 1 x)) 1
                                                  //| max (/ 1 x)) 1
                                                  //| ax (/ 1 x)) 1
                                                  //| x (/ 1 x)) 1
                                                  //|  (/ 1 x)) 1
                                                  //| (/ 1 x)) 1
                                                  //| / 1 x)) 2
                                                  //|  1 x)) 2
                                                  //| 1 x)) 2
                                                  //|  x)) 2
                                                  //| x)) 2
                                                  //| )) 2
                                                  //| ) 1
                                                  //|  0
                                                  //| res0: Boolean = true
	balance("())(".toList);                   //> ())( 0
                                                  //| ))( 1
                                                  //| )( 0
                                                  //| res1: Boolean = false
}