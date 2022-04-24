package zhang

object MathOperator {
  def main(args: Array[String]): Unit = {
    println(math IEEEremainder(11.0,4.0))

    val toBe = true // true:Boolean
    val question = toBe || !toBe // true:Boolean
    val paradox = toBe && !toBe // false:Boolean

    pepper && salt // 会短路

    salt && pepper // 会短路

    salt & pepper //逻辑与不会短路

    salt || pepper

    salt | pepper
  }

  def salt:Boolean ={
    println("salt");false
  }

  def pepper:Boolean = {
    println("pepper");true
  }

}
