package functions

object VariableLengthParameters {


  def main(args: Array[String]): Unit = {
    var result1=add(1,2,3,4,5,6,7)
    println("Var length example:"+result1)
  }
  def add(args: Int*) = {
    var sum = 0;
    for(a <- args) sum+=a
    sum
  }

}
