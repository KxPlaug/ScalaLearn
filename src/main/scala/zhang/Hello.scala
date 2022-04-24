package zhang

class Hello{
  def sayHello(x:String):Unit ={
    val out_string:Array[Char] = Array()
    println("Hello," + x)
    x.foreach(x_ => println(x_))
//    x.getChars(0,1,out_string,0)
  }
}