package Week1

object balance {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(616); 
  
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
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(48); val res$0 = 
	
	balance("(if (zero? x) max (/ 1 x))".toList);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(25); val res$1 = 
	balance("())(".toList);;System.out.println("""res1: Boolean = """ + $show(res$1))}
}
