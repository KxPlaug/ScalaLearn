package zhang

object ScalaScope {
  def printMultiTable(): Unit ={
    var i = 1
    // 只有i在作用域内
    while i <= 10 do
      var j = 1
      // i 和 j在作用域内
      while j <= 10 do
        var prod = (i * j).toString
        // i、j和prod在作用域内
        var k = prod.length
        // i、j、prod和k在作用域内

        while k < 4 do
          print(" ")
          k += 1

        print(prod)
        j += 1

      // i和j仍在作用域内;prod和k超出了作用域
      println()
      i += 1

    // i仍在作用域内;j、prod和k超出了作用域
  }

  def main(args: Array[String]): Unit = {
    printMultiTable()

//    val a = 1
//    val a = 2 // 无法编译，同一个作用域里无法定义相同名称的新变量
    val a = 1
    if a == 1 then
      val a = 2 // 可以正常编译，不在同一个作用域，内嵌作用域中的变量会遮挡(shadow)外部作用域内相同名称的变量，外部作用域内的同名变量在内嵌作用域中将不可见
      println(a)
    println(a)

  }
}
