object Alternate2Alphabets {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 100){
      if(i%2 == 1){
        print("A,")
      }else{
        print("B,")
      }
    }
  }

}
