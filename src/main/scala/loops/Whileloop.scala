package loops

object Whileloop {

  def main(args: Array[String]): Unit = {

    println("---while loop---")
    var a = 10;                     // Initialization
    while( a<=20 ){                // Condition
      println(a);
      a = a+2                      // Incrementation
    }

    println("---do-while loop---")
    var b = 10;         // Initialization
    do {
      println( b );
      b = b + 2;      // Increment
    }
    while( b <= 20 )     // Condition

  }

}
