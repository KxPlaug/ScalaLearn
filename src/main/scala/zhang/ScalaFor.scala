package zhang

import java.io.File

object ScalaFor {
  def fileLines(file: java.io.File): Array[String] =
    scala.io.Source.fromFile(file).getLines().toArray

//  def grep(pattern:String) =
//    val filesHere = (new java.io.File(".")).listFiles
//    for
//      file <- filesHere
//      if file.getName.endsWith(".scala")
//      line <- fileLines(file)
//      if line.trim matches pattern
//    do println(s"file:${line.trim}")

  def grep(pattern:String) =
    val filesHere = (new java.io.File(".")).listFiles
    for
      file <- filesHere
      if file.getName endsWith ".scala"
      line <- fileLines(file)
      trimmed = line.trim // 中途变量绑定
      if trimmed matches pattern
    do println(s"file: $trimmed")

  def scalaFiles: Array[Int] =
    val filesHere = (new java.io.File(".")).listFiles
//    for
//      file <- filesHere
//      if file.getName.endsWith(".scala")
//    yield file
    val forLineLengths =
      for
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim
        if trimmed.matches(".*for.*")
      yield trimmed.length

    forLineLengths

  def main(args: Array[String]): Unit = {
//    val filesHere = (new java.io.File(".")).listFiles
//    for file <- filesHere do
//      println(file)
//
//    for i <- 1 to 4 do
//      println(s"Iteration $i") // 包含上界
//
//    for i <-1 until 4 do
//      println(s"Iteration $i") // 不包含上界
//
//    // 在scala中并不常见
//    for i<- 0 to filesHere.length - 1 do
//      println(filesHere(i))
//
//    for file <- filesHere if file.getName.endsWith(".scala") do // 添加过滤器
//      println(file)
//
//    for file <- filesHere do // 指令式风格
//      if file.getName.endsWith(".scala") then
//        println(file)
//
//    for
//      file <- filesHere
//      if file.isFile
//      if file.getName.endsWith(".scala")
//    do println(file) // 多个过滤器
//
//
//    grep(".*gcd.*")
    println(scalaFiles.mkString("Array(", ", ", ")"))
  }
}
