object PrintAlphabet {
  def main(args: Array[String]): Unit = {
    var alphabet = 'a'
    while (alphabet<= 'z'){
      println(alphabet)
      alphabet = (alphabet + 1).toChar
    }
  }

}
