object MapReduceExample {
  def main(args: Array[String]): Unit = {

    // Step 1 – Create list 1..100
    val l = (1 to 100).toList

    // Step 2 – Filter even numbers
    val f = l.filter(ele => ele % 2 == 0)

    // Step 3 – Map: square each element
    val m = f.map(rec => rec * rec)

    // Step 4 – Reduce: sum all elements
    val r = m.reduce((total, element) => total + element)
    println("Sum of squares of even numbers 1..100 = " + r)

    // Equivalent alternatives
    var total = 0
    for (e <- m) total += e
    println("Sum using for-loop = " + total)

    val r2 = m.sum
    println("Sum using .sum = " + r2)
  }
}
