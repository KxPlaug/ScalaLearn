package zhang

class WhileLoop {
  def printArgs(args:List[String]): Unit ={
    for arg <- args do
      println(arg)
    args.foreach(println)
  }


}

object WhileLoop {
  def gcdLoop(x:Long, y:Long):Long = {
    var a = x
    var b = y
    while a != 0 do
      val temp = a
      a = b % a
      b = temp
    b
  }

  def main(args: Array[String]): Unit = {
    println(gcdLoop(100,20))
  }
}
