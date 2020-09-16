package condition

/*
Here, match using a variable named a.
This variable matches with best available case and prints output.
Underscore (_) is used in the last case for making it default case.
 */

object PatternMatching {
  def main(args: Array[String]): Unit = {
    var result = search ("Hello")
    print(result)
  }

  def search (a:Any):Any = a match
  {
    case 1  => println("One")
    case "Two" => println("Two")
    case "Hello" => println("Hello")
    case _ => println("No")

  }
}
