package zhang

import scala.annotation.{tailrec, targetName}

class Rational(n:Int, d:Int){
  require(d != 0)

  private val g = gcd(n.abs,d.abs)

  val numer:Int = n / g
  val denom:Int = d / g

  def this(n:Int) = this(n,1) // 辅助构造方法
//  println("Created " + n + "/" + d)
  override def toString = s"$numer/$denom"

  @targetName("add")
  def +(that:Rational):Rational =
    Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  @targetName("add")
  def +(i:Int):Rational =
    Rational(this.numer + i * this.denom,this.denom)

  @targetName("minus")
  def -(that:Rational):Rational=
    Rational(
      this.numer * that.denom - that.numer * this.denom,
      this.denom * that.denom
    )

  @targetName("minus")
  def -(i:Int):Rational =
    Rational(this.numer - i * this.denom,this.denom)

  @targetName("multiply")
  def *(that:Rational):Rational =
    Rational(this.numer * that.numer,this.denom * that.denom)

  @targetName("multiply")
  def *(i:Int):Rational =
    Rational(this.numer * i,this.denom)

  @targetName("divide")
  def /(that:Rational):Rational =
    Rational(this.numer * that.denom,this.denom * that.numer)

  @targetName("divide")
  def /(i:Int):Rational =
    Rational(this.numer,this.denom * i)

  def lessThan(that:Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that:Rational) =
    if this.lessThan(that) then that else this

  @tailrec
  private def gcd(a:Int, b:Int):Int =
    if b == 0 then a else gcd(b, a%b)
}

extension (x:Int)
  @targetName("add Rational")
  def +(y:Rational) = Rational(x) + y
  @targetName("minus Rational")
  def -(y:Rational) = Rational(x) - y
  @targetName("multiply Rational")
  def *(y:Rational) = Rational(x) * y
  @targetName("divide Rational")
  def /(y:Rational) = Rational(x) / y



object ScalaRational {
  def main(args: Array[String]): Unit = {

    //    val oneHalf =
    new Rational(1,2)
    val res1 = new Rational(1,2)

    println(res1)

    val res3 = Rational(3,4)
    println(res1 + res3)

    val y = Rational(3)
    println(y)

    val res4 = Rational(66,42)
    println(res4)


    val res5 = Rational(66,42) / 2
    println(res5)

    println(100 + res5)

//    Thread.`yield`() 反引号访问静态方法避免保留字影响

//    val res2 = new Rational(1,0)
//    println(res2)
  }
}
