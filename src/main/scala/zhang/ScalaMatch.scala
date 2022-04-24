package zhang

object ScalaMatch {
  def main(args: Array[String]): Unit = {
    val firstArg = if args.nonEmpty then args(0) else ""
    firstArg.match
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")

    val friend =
      firstArg match
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
    println(friend)
  }
}
