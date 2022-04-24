package zhang

class WhileLoop {
  def printArgs(args:List[String]): Unit ={
    for arg <- args do
      println(arg)
    args.foreach(println)
  }
}
