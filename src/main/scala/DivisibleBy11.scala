object DivisibleBy11 {
  def main(args: Array[String]): Unit = {
    println("Numbers divsible by 11 between 250 to 550")

    for (num <- 250 to 550){
      if (num % 11 ==0) {
        println(num)
      }
    }
  }
}
