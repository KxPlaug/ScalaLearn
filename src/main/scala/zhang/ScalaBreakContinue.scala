package zhang

import scala.annotation.tailrec

object ScalaBreakContinue {

  @tailrec
  def searchFrom(args:Array[String],i:Int):Int =
    if i >= args.length then -1
    else if args(i).startsWith("-") then searchFrom(args,i + 1)
    else if args(i).endsWith(".scala") then i
    else searchFrom(args,i + 1)

  def main(args: Array[String]): Unit = {
    var i = 0
    var foundIt = false
    while i < args.length && !foundIt do
      if !args(i).startsWith("-") then
        if args(i).endsWith(".scala") then
          foundIt = true
        else
          i = i + 1
      else
        i = i + 1

    println(searchFrom(Array("aaa.s","asdas.scala","yqqsb"),0))
  }
}
