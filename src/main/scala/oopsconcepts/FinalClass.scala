package oopsconcepts

final class Vehicle3{
  def show(){
    println("vehicle is running")
  }

}

class Bike3 extends Vehicle3{
  override def show(){
    println("bike is running")
  }
}

object MainObject12{
  def main(args:Array[String]){
    var b = new Bike3()
    b.show()
  }
}