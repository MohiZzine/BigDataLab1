import scala.io.StdIn

object Demo {
  def main(args: Array[String]) {
    print("Please enter your input: ")
    val line = StdIn.readLine()
    println("Thanks, you just typed: " + line)
  }
}
