package zhang

class MapAndForYield {
  def mapAndForYield(): Unit ={
    val adjectives = List("One","Two","Three")
    val nouns1 = adjectives.map(adj => adj + " Fish")
    val nouns2 =
      for adj <- adjectives yield
        adj + " Fish"
    println(nouns1)
    println(nouns2)
    val lengths1 = nouns1.map(noun => noun.length)
    val lengths2 =
      for noun <- nouns2 yield
        noun.length
    println(lengths1)
    println(lengths2)

    val ques = Vector("Who","What","When","Where")

    val usingMap = ques.map(que => que.toLowerCase + "?")
    val usingForYield =
      for que <- ques yield
        que.toLowerCase + "?"
    println(usingMap)
    println(usingForYield)
  }
}
