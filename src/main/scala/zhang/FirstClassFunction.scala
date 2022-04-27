package zhang

object FirstClassFunction {
  def main(args: Array[String]): Unit = {
    val increase = (x:Int) => x + 1
    println(increase(10)) // 11

    val addTwo = (x:Int) =>
      val increment = 2
      x + increment
    println(addTwo(10)) // 12

    val someNumbers = List(-11,-10,-5,0,5,10)
    someNumbers.foreach((x:Int) => println(x))

    println(someNumbers.filter((x: Int) => x > 0))
  }
}
