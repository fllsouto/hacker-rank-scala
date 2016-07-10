object ListReplication {
  def main(args: Array[String]): Unit = {
    println("List : " + f(3, List[Int](1,2,3,4)))
  }

 def f(n: Int, arr: List[Int]): List[Int] = {
  val list = {
    for {
      i <- arr
      times <- (1 to n)
      } yield i
    }.toList
  return list
  }
}