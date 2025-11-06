object DemoSums {

  // simple imperative sum (as in PDF)
  def sum(lb: Int, ub: Int) = {
    var total = 0
    for (element <- lb to ub) {
      total += element
    }
    total
  }

  // functional version: sum2 takes a function Int => Int
  def sum2(func: Int => Int, lb: Int, ub: Int) = {
    var total = 0
    for (element <- lb to ub) {
      total += func(element)
    }
    total
  }

  // helper functions asked in the exercise:
  def square(i: Int) = i * i
  def cube(i: Int) = i * i * i
  def times2(i: Int) = i * 2
  def id(i: Int) = i

  def main(args: Array[String]) {
    println("sum(1,10) = " + sum(1,10))
    println("sum2(id,1,10) = " + sum2(id,1,10))
    println("sum2(square,1,10) = " + sum2(square,1,10))
    println("sum2(cube,1,10) = " + sum2(cube,1,10))
    println("sum2(times2,1,10) = " + sum2(times2,1,10))
  }
}
