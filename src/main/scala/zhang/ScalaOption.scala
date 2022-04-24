package zhang

class ScalaOption {
  def scalaOption(): Unit ={
    val ques = Vector("Who","What","When","Where")
    val startsW = ques.find(q => q.startsWith("W"))
    val hasLen4 = ques.find(q => q.length == 4)
    val hasLen5 = ques.find(q => q.length == 5)
    val startsH = ques.find(q => q.startsWith("H"))
    val t1 = startsW.map(word => word.toUpperCase)
    println(t1)
    val t2 = for word <- startsW
      yield word.toUpperCase
    println(t2)
    val t3 = startsH.map(word => word.toUpperCase)
    println(t3)
    val t4 = for word <- startsH
      yield word.toUpperCase
    println(t4)
  }
}
