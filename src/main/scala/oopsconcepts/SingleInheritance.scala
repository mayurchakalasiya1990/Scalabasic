package oopsconcepts


/*
Inheritance is an object oriented concept which is used to reusability of code.
You can achieve inheritance by using extends keyword. To achieve inheritance a class must extend to other class.
A class which is extended called super or parent class.
a class which extends class is called derived or base class.
 */

class Employee{
  var salary:Float = 10000
}

class Programmer extends Employee{
  var bonus:Int = 5000
  println("Salary = "+salary)
  println("Bonus = "+bonus)
}

object MainObject3{
  def main(args:Array[String]){
    new Programmer()
  }
}
