package zhang

class ScalaCase {

}

case class Person(name:String,age:Int){
  def appendToName(suffix:String): Person ={
    Person(s"$name$suffix",age)
  }
}

object Person{
  def apply(name:String,age:Int):Person = {
    val capitalizedName =
      if name.nonEmpty then
        val firstChar = name.charAt(0).toUpper
        val restOfName = name.substring(1)
        s"$firstChar$restOfName"
      else
        throw new IllegalArgumentException("Empty Name")
    new Person(capitalizedName,age)
  }
}

object Main extends App{
  val p = Person("Sally",39)
//  println(p.name)
//  println(p.age)
//  println(p.toString)
//  assert(p.hashCode == Person("Sally",39).hashCode)
  val p2 = Person.apply("yqqsb",100)
  println(p2.name)
}
