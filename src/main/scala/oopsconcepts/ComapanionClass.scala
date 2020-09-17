package oopsconcepts

class ComapanionClass {
  def hello(){
    println("Hello, this is Companion Class.")
  }
}

object CompanionObject{
  def main(args: Array[String]): Unit = {
    new ComapanionClass().hello()
    println("And this is Companion Object.")
  }
}