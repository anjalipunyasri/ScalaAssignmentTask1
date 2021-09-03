object Question5 extends App{

  def check(a:Int,b:Int): Int = {

    val a_abs = Math.abs(a - 100)
    val b_abs = math.abs(b - 100)

    // It prints 0 if the given input is same
    if(a_abs == b_abs) 0
    // It prints the maximum number
    else if (a_abs < b_abs) a
    else b
  }

  // It prints the resultant output.
  println("Output is :"+check(78,19))
  println("Output is:"+check(12,12))
  println("Output is:"+check(30,67))

}
