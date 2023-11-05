object kgTogm {
  def main(args: Array[String]): Unit = {
    //input weight in kg
    print("Enter the weight in kg: ")
    val weightKg = scala.io.StdIn.readDouble()

    //convert kg to gm(1kg = 1000gm)
    val weightGm = weightKg * 1000

    //display the result
    println(s"$weightKg kg is equal to $weightGm gm.")
  }
}
