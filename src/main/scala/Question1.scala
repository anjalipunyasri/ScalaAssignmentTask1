object Question1 extends App{

  def display(name:String): String = {

    //Here iam taking the substring
    if(name.length < 2) name
    else name.substring(0,2) * 4
  }

  //It prints the output
  println("Output is :" + display("India"))

}
