package condition

object Ifcondition {

  def main(args: Array[String]): Unit = {
    var number:Int = 2
    if(number>=0 && number<50){
      println ("fail")
    }
    else if(number>=50 && number<60){
      println("D Grade")
    }
    else if(number>=60 && number<70){
      println("C Grade")
    }
    else if(number>=70 && number<80){
      println("B Grade")
    }
    else if(number>=80 && number<90){
      println("A Grade")
    }
    else if(number>=90 && number<=100){
      println("A+ Grade")
    }
    else println ("Invalid")


    var number1:Int = 21
    if(number1%2==0){
      println("Even number")
    }else{
      println("Odd number")
    }

  }

}
