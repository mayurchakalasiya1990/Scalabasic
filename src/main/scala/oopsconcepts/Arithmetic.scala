package oopsconcepts
/*
Scala provides method overloading feature which allows us to define methods of same name but having different parameters or data types.
It helps to optimize code.
 */
class Arithmetic {

  def add(a:Int,b:Int): Unit ={
    var sum=a+b
    println(sum)
  }
  def add(a:Int,b:Int, c:Int): Unit ={
    var  sum=a+b+c
    print(sum)
  }
}

object MainObject{
  def main(args: Array[String]): Unit = {
    var a=new Arithmetic()
    a.add(19,29)
    a.add(1,3,4)
  }
}
