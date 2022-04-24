package zhang
import scala.collection.mutable
//class ChecksumAccumulator {
//  private var p_sum = 0
//  var sum = 0
//
//  def checksumAccumulator(): Unit ={
//    val acc = new ChecksumAccumulator
//    val csa = new ChecksumAccumulator
//  }
//
//  def add(b:Byte):Unit = {
//    sum += b
//  }
//
//  def checksum:Int = {
//    ~(sum & 0xFF) + 1
//  }
//
//  def getSum:Int = {
//    sum
//  }
//
//}

class ChecksumAccumulator{
  private var sum = 0
  def add(b: Byte):Unit = sum += b
  def checksum():Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator{
  private val cache = mutable.Map.empty[String,Int]

  def calculate(s:String):Int = {
    if cache.contains(s) then
      cache(s)
    else
      val acc = new ChecksumAccumulator
      for c <- s do
        acc.add((c>>8).toByte)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
  }
}

//object Main extends App{
//  val csa = new ChecksumAccumulator
//  println(0xFF)
//  val s = "Hello";println(s)
//  val res = ChecksumAccumulator.calculate("Every value is an object")
//  println(res)
//}
