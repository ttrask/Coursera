package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int):Int = {
    def GenerateRow(rowNum: Int): Array[Int] = {

      if (rowNum == 0) {
      	//println("1")
        return Array(1);
      } else {
        val oldRow = GenerateRow(rowNum - 1)
        var row: Array[Int] = new Array[Int](rowNum+1)
        row(0) = 1;
        row(rowNum ) = 1
        for (i <- 1 to rowNum - 1) {
          row(i) = oldRow(i - 1) + oldRow(i)
        }
       // println(row.mkString(" "));

        return row;
      }
    }

    return GenerateRow(r)(c);
  }         

  /**
   * Exercise 2
   */
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
	
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
