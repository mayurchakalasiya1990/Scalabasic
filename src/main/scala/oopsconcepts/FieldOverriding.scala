package oopsconcepts
/*
you can override only those variables which are declared by using val keyword in both classes.
Below are some interesting examples which demonstrate the whole process.
 */
class Vehicle{
  val speed:Int = 60

}
class Bike extends Vehicle{
  override val speed:Int = 100     // Override keyword
  def show(){
    println(speed)
  }
}
object MainObject8{
  def main(args:Array[String]){
    var b = new Bike()
    b.show()
  }
}