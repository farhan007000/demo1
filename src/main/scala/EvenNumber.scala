object EvenNumber {
  def main(args: Array[String]): Unit= {
    println("Print all the even numbers in range 700 to 900")
    for (num <- 700 to 900){
      if (num % 2 == 0)
      println(num)
    }
  }
}
