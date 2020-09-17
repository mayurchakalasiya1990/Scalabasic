package oopsconcepts

class ThisExample {

  var id:Int = 0
  var name: String = ""
  def this(id:Int, name:String){
    this()
    this.id = id
    this.name = name
  }
  def show(){
    println(id+" "+name)
  }

}

object MainObject2 {
  def main(args: Array[String]) {
    var t = new ThisExample(101, "Martin")
    t.show()
  }
}