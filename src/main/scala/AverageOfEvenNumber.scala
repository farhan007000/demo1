object AverageOfEvenNumber {
  def main(args: Array[String]): Unit = {
    val firstNumber = 24
    val lastNumber = 100
    val commonDifference= 2

    var sum = 0
    var count = 0

    for (num <- firstNumber to lastNumber by commonDifference){
      sum += num
      count += 1
    }

    val average = sum.toDouble / count
    println(s"The average number of sequence is:  $average ")
  }

}
