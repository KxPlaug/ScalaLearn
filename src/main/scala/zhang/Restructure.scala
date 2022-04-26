package zhang

object Restructure {
  // 以序列类型返回一行
  def makeRowSeq(row: Int): IndexedSeq[String] =
    for col <- 1 to 10 yield
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod

  // 以字符串类型返回一行
  def makeRow(row: Int):String = makeRowSeq(row).mkString

  // 以字符串类型返回逐行表示的表格
  def multiTable():String =
    val tableSeq = // 行字符串的序列
      for row <- 1 to 10
      yield makeRow(row)
    tableSeq.mkString("\n")

  def main(args: Array[String]): Unit = {
    println(multiTable())
  }
}
