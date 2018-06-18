object scratch {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def loop: Boolean = loop;                       //> loop: => Boolean
  def x = false;                                  //> x: => Boolean
  def y = true;                                   //> y: => Boolean
  
  def and(x:Boolean, y:Boolean):Boolean = if(x) y else x
                                                  //> and: (x: Boolean, y: Boolean)Boolean
  
  def or(x:Boolean, y:Boolean) = if(x) x else y   //> or: (x: Boolean, y: Boolean)Boolean
  
  and(true, true)                                 //> res0: Boolean = true
  and(true, false)                                //> res1: Boolean = false
  and(false, false)                               //> res2: Boolean = false
  
  
  or(true, true)                                  //> res3: Boolean = true
  or(true, false)                                 //> res4: Boolean = true
  or(false, false)                                //> res5: Boolean = false
  
}