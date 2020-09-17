package oopsconcepts

class Vehicle12{
  final val speed:Int = 60
}
class Bike12 extends Vehicle12{
  override val speed:Int = 100
  def show(){
    println(speed)
  }
}

object MainObject{
  def main(args:Array[String]){
    var b = new Bike()
    b.show()
  }
}