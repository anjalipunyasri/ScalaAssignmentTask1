object Question3 extends App{

  def check(name:String):String = {
    val lengthy = name.length
    val lastNum = name.charAt(lengthy-1)
    //It prints the lastChar plus name plus lastChar
    lastNum + name + lastNum
  }

  //It prints the resultant output
  println("Output: "+ check("Scala"))

}
