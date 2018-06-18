package Week1

object pasacl {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

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
		
  }                                               //> pascal: (c: Int, r: Int)Int

	pascal(1,1)                               //> res0: Int = 1
	pascal(0,2)                               //> res1: Int = 1
	pascal(1,2)                               //> res2: Int = 2
	pascal(1,3)                               //> res3: Int = 3
                                                  
}