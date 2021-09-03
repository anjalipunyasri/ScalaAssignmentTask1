object Question2 extends App{

  def check(name: String, a: Int) : String = {

    // Iam using take and drop method here to perform required operation.
    name.take(a) + name.drop(a+1)
  }

  // It prints the expected output.
  println("Original string is Scala:")
  println("Output is :" + check("Scala", 1))
  println("Output is :"+ check("Scala",0))
  println("Output is :"+ check("Scala",4))

}
