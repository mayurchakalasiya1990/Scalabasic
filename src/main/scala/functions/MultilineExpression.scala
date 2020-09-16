package functions

object MultilineExpression {

  def main(args: Array[String]): Unit = {
    var result1=add1(10,20)
    var result2=add3(10,20)
    println(result1)
    println(result2)
  }

  //The following program explains about if we break an expression into multiline, the scala compiler throw a warning message.
  // program does not evaluate complete expression and just return b here. So, be careful while using multiline expressions.
  def add1(a:Int, b:Int) = {
    a
    +b
  }

  def add3(a:Int, b:Int) = {
    (a
      +b)
  }

}
