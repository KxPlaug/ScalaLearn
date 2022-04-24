package zhang
import scala.annotation.tailrec
import scala.io.StdIn.readLine

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

  @tailrec
  def gcd(x:Long, y:Long):Long =
    if y == 0 then x else gcd(y,x%y)

  def main(args: Array[String]): Unit = {
    println(gcdLoop(100,20))
    println(gcd(100,20))
//    while
//      val line = readLine()
//      println(s"Read: $line")
//      line != ""
//    do()
  }
}
