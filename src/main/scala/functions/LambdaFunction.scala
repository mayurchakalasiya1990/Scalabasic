package functions

object LambdaFunction {

  def main(args: Array[String]) = {

    //You can create anonymous function either by using => (rocket) or _ (underscore) wild card in scala.
    //Anonymous function is a function that has no name but works as a function.
    // It is good to create an anonymous function when you don't want to reuse it latter.
    var result1 = (a:Int, b:Int) => a+b        // Anonymous function by using => (rocket)
    var result2 = (_:Int)+(_:Int)              // Anonymous function by using _ (underscore) wild card
    println(result1(10,10))
    println(result2(10,10))
  }

}
