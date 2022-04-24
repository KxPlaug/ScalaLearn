package zhang
import scala.language.postfixOps


object Rich {
  def main(args: Array[String]): Unit = {
    0 max 5
    0 min 5
    -2.7 abs

    -2.7 round

    1.5 isInfinity

    (1.0 / 0) isInfinity

    println(4 to 6)
    println("bob" capitalize)
    println("robert" drop 2)
  }
}
