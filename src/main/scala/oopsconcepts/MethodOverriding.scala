package oopsconcepts

/*
In scala, you must use either override keyword or override annotation to override methods from parent class.
 */

class Vehicle1{
  def run(){
    println("vehicle is running")
  }
}

class Bike1 extends Vehicle1{
  override def run(){
    println("Bike is running")
  }
}

object MainObject51{
  def main(args:Array[String]){
    var b = new Bike1()
    b.run()
  }
}
