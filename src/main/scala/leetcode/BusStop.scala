package leetcode

object BusStop {
  def distanceBetweenBusStops(distance: Array[Int], start: Int, destination: Int): Int =
    var distance1 = 0
    if start < destination then
      for i <- start until destination do
        distance1 += distance(i)
    else
      for i <- start until distance.length do
        distance1 += distance(i)
      for i <- 0 until destination do
        distance1 += distance(i)
    var sum = distance.sum
    if distance1 > sum / 2 then
      sum - distance1
    else
      distance1

  def main(args: Array[String]): Unit = {
    println(distanceBetweenBusStops(Array(1,2,3,4),0,1))
  }
}
