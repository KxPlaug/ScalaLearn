package zhang

object InsertString {
  def main(args: Array[String]): Unit = {
    val name = "reader"
    println(s"Hello,$name!")

    println(s"The answer is ${6 * 7}.") // s插值器

    println(raw"No\\\\escape!") // raw插值器，不识别转义符号，打印No\\\\escape!

    println(f"${math.Pi}%.5f") // f插值器，允许给内嵌表达式加上printf风格

    val pi = "Pi"

    println(f"$pi is approximately ${math.Pi}%.8f.")
  }
}
