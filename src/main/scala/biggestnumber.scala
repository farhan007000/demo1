object biggestnumber {
  def main(args: Array[String]): Unit = {
    val num1 = 100
    val num2 = 500
    val num3 = 250

    val largest = List(num1, num2, num3).max

    println(s"The largest number among $num1, $num2, $num3 is : $largest")
  }

}
