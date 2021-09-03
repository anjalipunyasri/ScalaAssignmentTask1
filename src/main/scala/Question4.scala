object Question4 extends App{

  def check(name:String): String ={

    //If is added to the String if it is not in the String, otherwise it prints actual String.
    if(name.startsWith("If")) name
    else "If " + name
  }

  //It prints the resultant output
  println("Output is :" +check("If you are facing any issue please reach us"))
  println("Output is :" +check("you need anything ask me"))

}
