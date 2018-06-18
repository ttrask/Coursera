package Week1

object pasacl {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(528); 

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
		
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(14); val res$0 = 

	pascal(1,1);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); val res$1 = 
	pascal(0,2);System.out.println("""res1: Int = """ + $show(res$1));$skip(13); val res$2 = 
	pascal(1,2);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); val res$3 = 
	pascal(1,3);System.out.println("""res3: Int = """ + $show(res$3))}
                                                  
}
