object Question6 extends App{

  def check(a:Int,b:Int): Boolean = {

    // It checks and satisfies the given condition
    if((a <= 20 && a >= 50) || (a >= 20 && a <= 50)) true
    else false
  }

  // It prints the resultant output.
  println("Output is: "+check(56,78))
  println("Output is :"+check(23,45))
  println("Output is :"+check(10,30))
  println("Output is :"+check(30,50))
  println("Output is :"+check(25,45))
  println("Output is :"+check(60,80))
  println("Output is :"+check(10,60))

}
