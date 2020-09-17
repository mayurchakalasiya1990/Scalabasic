package oopsconcepts

class Bank{
  def getRateOfInterest()={
    0
  }
}

class SBI extends Bank{
  override def getRateOfInterest(): Int = 8
}
class ICICI extends Bank{
  override def getRateOfInterest(): Int = 10
}

class AXIS extends Bank{
  override def getRateOfInterest(): Int = 12
}

object MainObject6{
  def main(args: Array[String]): Unit = {
    var s=new SBI();
    var i=new ICICI();
    var a=new AXIS();
    println("SBI Rate of Interest: "+s.getRateOfInterest());
    println("ICICI Rate of Interest: "+i.getRateOfInterest());
    println("AXIS Rate of Interest: "+a.getRateOfInterest());
  }
}