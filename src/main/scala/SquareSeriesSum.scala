object SquareSeriesSum {
  def main(args: Array[String]): Unit = {
    val startNum = 5
    val endNum = 102

    var sum = 0
    for (num <- startNum to endNum) {
      sum += num * num

    }
    println(sum)
  }

}
