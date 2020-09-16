package loops

object Forloop {

  def main(args: Array[String]): Unit = {
    //for-loop example by using to keyword
    println("---For loop using to keyword---")
    for (a <- 1 to 10) {
      println(a);
    }

    //for-each loop
    println("---For each Loop---")
    var list = List(1,2,3,4,5,6,7,8,9)  // Creating a list
    list.foreach{
      println     // Print each element
    }
    list.foreach(print)
    println //newline
    list.foreach((element:Int)=>print(element+" "))      // Explicitly mentioning type of elements

    println()
    println("---for-loop filtering Example---")

    for( a <- 1 to 10 if a%2==0 ){
      println(a);
    }

    println("---for-loop Example by using until keyword---")

    for( a <- 1 until 10 ){
      println(a);
    }

    println("---for-loop Example by using yield keyword---")

    var result = for( a <- 1 to 10) yield a
    for(i<-result){
      println(i)
    }

    println("---for-loop Example using by keyword--")

    for(i<-1 to 10 by 2){
      println(i)
    }

  }
}
