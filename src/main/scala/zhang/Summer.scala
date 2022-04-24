package zhang
import ChecksumAccumulator.calculate

object Summer{
  def main(args:Array[String]): Unit ={
    args.foreach(arg => println(arg + ":" + calculate(arg)))
  }
}
