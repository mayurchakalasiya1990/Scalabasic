package oopsconcepts

/*

Singleton object is an object which is declared by using object keyword instead by class.
No object is required to call methods declared inside singleton object.

In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.
If you don't create singleton object, your code will compile successfully but will not produce any output.
Methods declared inside Singleton Object are accessible globally. A singleton object can extend classes and traits.
 */

object SingletonObject {
  def hello(){
    println("Hello, This is Singleton Object")
  }
}

object Singleton{
  def main(args: Array[String]): Unit = {
    SingletonObject.hello()
  }
}