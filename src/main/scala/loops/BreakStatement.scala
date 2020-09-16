package loops
import scala.util.control.Breaks._

object BreakStatement {

  def main(args: Array[String]): Unit = {
    //Break is used to break a loop or program execution. It skips the current execution. Inside inner loop it breaks the execution of inner loop.
    breakable {                                 // Breakable method to avoid exception
      for(i<-1 to 10 by 2){
        if(i==7)
          break                           // Break used here
        else
          println(i)
      }
    }
  }

}
