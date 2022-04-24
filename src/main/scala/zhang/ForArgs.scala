package zhang

class ForArgs {
  def forArgs(args:String*):Unit = {
    for arg <- args do
      println(arg)
  }
}
