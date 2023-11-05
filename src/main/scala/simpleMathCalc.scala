object simpleMathCalc {
  def main(args: Array[String]): Unit = {
    print("Enter the first number: ")
    val num1 = scala.io.StdIn.readDouble()

    print("Enter the operator(+, -, *, /):")

    val operator = scala.io.StdIn.readLine()

    print("Enter the second number: ")
    val num2 = scala.io.StdIn.readDouble()

    val result = operator match {
      case "+" => num1 + num2
      case "_" => num1 - num2
      case "*" => num1 * num2
      case "/" => if (num2 != 0) num1 / num2 else "Division by zero is not allowed."
      case _ => "Invalid Operator"
    }
    println(s"Result: $num1 $operator $num2 = $result")
  }

}
