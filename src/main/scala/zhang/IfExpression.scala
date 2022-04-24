package zhang

object IfExpression {
  def main(args: Array[String]): Unit = {
    var filename1 = "default.txt"
    if args.nonEmpty then
      filename1 = args(0)

    var filename2 =
      if args.nonEmpty then args(0)
      else "default.txt"

    println(if (args.nonEmpty) args(0) else "default.txt")
  }
}
