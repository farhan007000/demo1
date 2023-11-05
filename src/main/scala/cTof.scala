object cTof {
  def main(args: Array[String]): Unit = {
    print("Enter the temperature in Celsius: ")
    val tempCelsius = scala.io.StdIn.readDouble()
    //F=(C * 9/5) + 32
    val tempFahrenheit = (tempCelsius * 9/5) + 32

    println(s"$tempCelsius Celsius is equal to $tempFahrenheit Fahrenhait.")
  }

}
