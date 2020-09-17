package oopsconcepts

import com.sun.security.auth.NTSidPrimaryGroupPrincipal

class PrimaryConstructor {
  println("Hello from default constructor");
}

object mainObject{
  def main(args: Array[String]): Unit = {
    var r=new PrimaryConstructor()
  }
}
