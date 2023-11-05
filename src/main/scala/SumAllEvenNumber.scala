object SumAllEvenNumber {
  def main(args: Array[String]): Unit={
    println("Sum All Even Number Between 382 to 582:")
    var sum = 0
    for (num <- 382 to 582){
      if (num % 2 == 0) {
        sum += num
      }
    }
    println(sum)
  }

}



