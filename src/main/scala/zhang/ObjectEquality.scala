package zhang

object ObjectEquality {
  def main(args: Array[String]): Unit = {
    1 == 2 // false:Boolean
    1 != 2 // true:Boolean
    2 == 2 // true:Boolean

    List(1,2,3) == List(1,2,3) // true:Boolean
    List(1,2,3) == List(4,5,6) // false:Boolean

    1 == 1.0 // true:Boolean
//    List(1,2,3) == "hello" // false:Boolean

    List(1,2,3) == null // false:Boolean
    null == List(1,2,3) // false:Boolean

    println(("he" + "llo") == "hello") // true:Boolean
  }
}
