package zhang
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException

object ScalaTry {
  def half(n: Int): Int =
    if n % 2 == 0 then
      n / 2
    else
      throw new RuntimeException("n must be even")

//  def readFile(filename:String):FileReader =
//    try
//      val f = new FileReader(filename)
//      f
//    catch
//      case ex: FileNotFoundException => // 处理文件缺失情况
//        case ex: IOException => // 处理其他I/O错误
//    finally
//      println("Error")

  def urlFor(path:String):URL =
    try new URL(path)
    catch  case e: MalformedURLException =>
      new URL("https://www.******.org")

  def f:Int = try return 1 finally return 2 // 当finally包含显式的返回语句时会改写try或者catch字句中的值

  def g:Int = try 1 finally 2 // 非显式返回语句不会改写try中值

  // 最好避免在finally子句中返回值，最好将finally子句用来确保某些副作用发生，如关闭一个打开的文件

  def main(args: Array[String]): Unit = {
//    val file = new FileReader("input.txt")
//    try
//      println(file.read()) // 使用文件
//    finally
//      file.close() // 确保关闭文件
    println(f)
    println(g)
  }
}
