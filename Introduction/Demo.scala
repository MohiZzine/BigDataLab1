/* 
object Demo {
   val greeting: String = "Hello, world!"

   def main(args: Array[String]) {
      println( greeting )
   }
}


object Demo {
   def main(args: Array[String]) {
      var palindrome = "Dot saw I was Tod";
      var len = palindrome.length();

      println( "String Length is : " + len );
   }
}

object Demo {
   def main(args: Array[String]) {
      var str1 = "Dot saw I was ";
      var str2 =  "Tod";

      println("Dot " + str1 + str2);
   }
}

object Demo {
  def main(args: Array[String]) {
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"
    // semblable à la fonction printf en C
    var fs = printf("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s", floatVar, intVar, stringVar)

    println(fs)
  }
}



object Demo {
   def main(args: Array[String]) {
      val name = "James"

      println(s"Hello, $name")
      println(s"1 + 1 = ${1 + 1}")
   }
}

import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

object Demo {
   def main(args: Array[String]) {
      val pt = new Point(10, 20);

      // Move to a new location
      pt.move(10, 10);
   }
}


import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}

// Demo est un objet singleton
object Demo {
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);

      // Move to a new location
      loc.move(10, 10, 5);
   }
}
*/
