package zhang

object LocalFunction {
  def padLines(text: String, minWidth: Int): String =
    def padLine(line: String): String = // 局部函数
      if line.length >= minWidth then line
      else line + " " * (minWidth - line.length)
    val paddedLines =
      for line <- text.linesIterator yield
        padLine(line)
    paddedLines.mkString("\n")

  def main(args: Array[String]): Unit = {
    print(padLines("yqqsb",100))
  }
}
