object Question7 extends App{

  def check(number: Int, name:String) : String = {

    // It checks if the number/char is happy or not
    val character_happy = true
    val checking_happy = ((name.charAt(number) == name.charAt(number - 1)) || (name.charAt(number) == name.charAt(number + 1)))
    if (checking_happy == character_happy) "happy"
    else "not happy"

  }

  // It prints the resultant output
  println("Checking the whether the string is happy or not : " +check(4,"SwiggyZomato"))

}

