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

//    println(someNumbers.filter((x: Int) => x > 0))
    println(someNumbers.filter(x => x > 0)) // 函数字面量简写

    println(someNumbers.filter(_ > 0)) // 占位符语法

    val f = (_: Int) + (_: Int)

    println(f(5,10))
  }
}
