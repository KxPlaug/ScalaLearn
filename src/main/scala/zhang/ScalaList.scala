package zhang

class ScalaList {
  def scalaList():Unit = {
//    val oneTwoThree = List(1,2,3)
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwoThreeFour)
    val twoThree= List(2,3)
    val oneTwoThree = 1::twoThree
    println(oneTwoThree)
    val oneTwoThreeFourFive = 1::2::3::4::5::Nil
    println(oneTwoThreeFourFive)
    println(oneTwoThreeFourFive(1))
  }
}
