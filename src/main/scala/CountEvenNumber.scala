object CountEvenNumber {
  def main(args: Array[String]): Unit = {
    var count = 0
    println("Enter First Number")
    val num1 = scala.io.StdIn.readInt()
    println("Enter Second Number")
    val num2 = scala.io.StdIn.readInt()
    for (num <- num1 to num2){
        if (num % 2 ==0){
          count += 1
        }
    }
    println(count)
  }
}
