package zhang
import scala.collection.mutable
import scala.collection.immutable.HashSet

class ScalaMapSet {
  def scalaSet(): Unit ={
    var jarSet = Set("Boeing","Airbus") // 不可变Set
    jarSet += "Lear" // jarSet = jarSet + "Lear" 实际上是将var jarSet重新赋值
    val query = jarSet.contains("Cessna")
    println(query)
    val movieSet = mutable.Set("Spotlight","Moonlight")
    movieSet += "Parasite" // 将可变集合改变

    val hashSet = HashSet("Tomatoes","Chilies")
    val ingredients = hashSet + "Coriander"
    println(ingredients)
  }

  def scalaMap(): Unit ={
    val treasureMap = mutable.Map.empty[Int,String]
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    val step2 = treasureMap(2)
    println(step2)

    val romanNumeral = Map(
      1 -> "I",
      2 -> "II",
      3 -> "III",
      4 -> "IV",
      5 -> "V"
    )
    val four = romanNumeral(4)
    println(four)
  }
}
