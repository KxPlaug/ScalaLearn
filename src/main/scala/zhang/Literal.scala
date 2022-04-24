package zhang

object Literal{
  def main(args:Array[String]): Unit ={
    val hex = 0x5 // 5:Int
    val hex2 = 0x00FF // 255:Int
    val magic = 0xcafebabe // -889275714:Int
    val billion = 1_000_000_000 // 1000000000:Int

    val dec1 = 31 // 31:Int
    val dec2 = 255 // 255:Int
    val dec3 = 20 // 20:Int

    val prog = 0XCAFEBABEL // 3405691582:Long
    val tower = 35L // 35:Long
    val of = 331 // 311:Long

    val little: Short = 367 // 367:Short
    val littler: Byte = 38 // 38:Byte

    val big = 1.2345 // 1.2345:Double
    val bigger = 1.2345e1 // 12.345:Double
    val biggerStill = 123E45 // 1.23E47:Double
    val trillion = 1_000_000_000e3  // 1.0E12:Double

//    val little = 1.2345F // 1.2345:Float
//    val littleBigger = 3e5f // 300000.0:Float

    val anotherDouble = 3e5 // 300000.0:Double
    val yetAnother = 3e5D // 300000.0:Double

//    val invoice:BigInt  = 1_000_000_000_000_000_000_000
//      1_000_000_000_000_000_000_000
//    println(invoice)
    val a = 'A'
    val d = '\u0041'
    val f = '\u0044'

    val hello = "hello"
    val escapes = "\\\"'"
    println(escapes)

    println("""Welcome to Ultamix 3000.
        Type "HELP" for help.""")

    println("""|Welcome to Ultamix 3000.
        |Type "HELP" for help.""".stripMargin)

    val bool = true // true:Boolean
    val fool = false // false:Boolean
  }
}