package functions

object FunctionExmaple {

  def functionExample() = { // Defining a function
    var a = 10
    a
  }
  def functionExample(a:Int, b:Int) = {
    var c = a+b
    println("Method with Param:"+c)
  }

  def functionDefaultParamExample(a:Int = 10, b:Int = 50):Unit = { // Parameters with default values as 0
    var c = a + b
    println("Default Param Value:"+c)
  }


  def main(args: Array[String]): Unit = {
    var result = functionExample()          // Calling function
    println(result)
    functionExample(10,20)          // Calling function
    functionDefaultParamExample()

    var result1 = functionExample(a = 15, b = 2)    // Parameters names are passed during call
    var result2 = functionExample(b = 15, a = 2)    // Parameters order have changed during call
    var result3 = functionExample(15,2)             // Only values are passed during call
    println("\n"+result2+"\n"+result3)

  }



}
