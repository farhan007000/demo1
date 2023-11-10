import org.apache.spark.{SparkConf, SparkContext}
object frequentlyUsedIp {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("frequentlyUsedIp").setMaster("local")
    val sc = new SparkContext(conf)

    val data = List(
      "122.155.1 122.155.2 122.155.3 122.155.4 122.155.5",
      "122.155.2 122.155.6 122.155.3 122.155.4 122.155.5",
      "122.155.7 122.155.1 122.155.3 122.155.2 122.155.1"
    )

    val inputRDD = sc.parallelize(data)

    val ipAddressCounts = inputRDD
      .flatMap(line => line.split(" "))
      .map(ip => (ip, 1))
      .reduceByKey(_ + _)

    val mostFrequentIPAddress = ipAddressCounts
      .reduce((ip1, ip2) => if (ip1._2 > ip2._2) ip1 else ip2)
      ._1

    println(s"The most frequently used IP address is: $mostFrequentIPAddress")
    //scala.io.StdIn.readInt()
    sc.stop()

  }


}
