package zhang
import scala.language.postfixOps

object Operator {
  def main(args: Array[String]): Unit = {
    val sum1 = 1 + 2
    val sum2 = 1.+(2)
    println(sum2)

    val longSum = 1 + 2L

    val s = "Hello,world!"

    println(s indexOf 'o') // 操作符表示法
    println(s.indexOf('o')) // 非操作符表示法

    println((2.0).unary_-)

    println(s.toLowerCase)

    println(s toLowerCase)
  }
}
