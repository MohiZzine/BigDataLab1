object Ex1a_SumImperative {

  // base function: sum of numbers in [lb, ub]
  def sum(lb: Int, ub: Int): Int = {
    var total = 0
    for (element <- lb to ub) {
      total += element
    }
    total
  }

  // 1. sum of squares
  def sumSquare(lb: Int, ub: Int): Int = {
    var total = 0
    for (element <- lb to ub) {
      total += element * element
    }
    total
  }

  // 2. sum of cubes
  def sumCube(lb: Int, ub: Int): Int = {
    var total = 0
    for (element <- lb to ub) {
      total += element * element * element
    }
    total
  }

  // 3. sum of numbers multiplied by 2
  def sumTimes2(lb: Int, ub: Int): Int = {
    var total = 0
    for (element <- lb to ub) {
      total += element * 2
    }
    total
  }

  def main(args: Array[String]): Unit = {
    println("sum(1,10) = " + sum(1,10))
    println("sumSquare(1,10) = " + sumSquare(1,10))
    println("sumCube(1,10) = " + sumCube(1,10))
    println("sumTimes2(1,10) = " + sumTimes2(1,10))
  }
}
