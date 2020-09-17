package oopsconcepts

class Student {
    var id:Int = 0;                         // All fields must be initialized
    var name:String = null;
}

class Student1(id:Int, name:String){     // Primary constructor
  def show(){
    println("Student Object-1:"+id+" "+name)
  }
}

object MainObject1 {
  def main(args: Array[String]) {
    var s = new Student() // Creating an object
    println("Student Object:"+s.id + " " + s.name);

    var s1 = new Student1(100,"Martin")   // Passing values to constructor
    s1.show()
  }
}
