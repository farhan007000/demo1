object OddNumber {
  def main(args: Array[String]): Unit = {
    println("Print all odd number from 251 to 51")

    for (num <- 251 to 51 by -1) {
      if (num % 2 != 0) {
        println(num)
      }
    }
  }

}
