import scala.io.Source

object HelloWorldNTimes {
  def main(args: Array[String]): Unit = {
    val n = io.Source.stdin.getLines().take(1).toList.head.toInt
    println("N val : " + n)
    f(n)
  }

  def f(n: Int): Unit = {
    if (n > 0 ) {
      println("Hello World")
      f(n - 1)
    }
  }
}