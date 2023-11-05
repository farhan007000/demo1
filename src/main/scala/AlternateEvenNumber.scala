object AlternateEvenNumber {
  def main(args: Array[String]): Unit = {
    println("Alternate Even Number from 20 to 140")
    for (num <- 20 to 140 ){
      if (num % 4 ==0){
        println(num)
      }
    }
  }

}
