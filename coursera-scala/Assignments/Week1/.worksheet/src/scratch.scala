object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(31); 
  
  def loop: Boolean = loop;System.out.println("""loop: => Boolean""");$skip(17); ;
  def x = false;System.out.println("""x: => Boolean""");$skip(16); ;
  def y = true;System.out.println("""y: => Boolean""");$skip(60); ;
  
  def and(x:Boolean, y:Boolean):Boolean = if(x) y else x;System.out.println("""and: (x: Boolean, y: Boolean)Boolean""");$skip(51); 
  
  def or(x:Boolean, y:Boolean) = if(x) x else y;System.out.println("""or: (x: Boolean, y: Boolean)Boolean""");$skip(21); val res$0 = 
  
  and(true, true);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(19); val res$1 = 
  and(true, false);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(20); val res$2 = 
  and(false, false);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(24); val res$3 = 
  
  
  or(true, true);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(18); val res$4 = 
  or(true, false);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(19); val res$5 = 
  or(false, false);System.out.println("""res5: Boolean = """ + $show(res$5))}
  
}
