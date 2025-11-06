object Ex1b_SumFunctional {

  // higher-order function: takes another function as parameter
  def sum2(func: Int => Int, lb: Int, ub: Int): Int = {
    var total = 0
    for (element <- lb to ub) {
      total += func(element)
    }
    total
  }

  // function definitions
  def id(i: Int): Int = i
  def square(i: Int): Int = i * i
  def cube(i: Int): Int = i * i * i
  def times2(i: Int): Int = i * 2

  def main(args: Array[String]): Unit = {
    println("sum2(id,1,10) = " + sum2(id, 1, 10))           // normal sum
    println("sum2(square,1,10) = " + sum2(square, 1, 10))   // sum of squares
    println("sum2(cube,1,10) = " + sum2(cube, 1, 10))       // sum of cubes
    println("sum2(times2,1,10) = " + sum2(times2, 1, 10))   // sum of doubles
  }
}
