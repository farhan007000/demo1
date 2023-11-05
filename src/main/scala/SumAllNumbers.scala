object SumAllNumbers {
  def main(args: Array[String]): Unit = {
    println("Sum all the numbers from 56 to 153")
    var sum = 0
    for (num <- 56 to 153){
        sum += num
    }
    println(sum)
  }

}
