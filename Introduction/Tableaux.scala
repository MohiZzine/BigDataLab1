/ * object Demo {
  def main(args: Array[String]) {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Afficher les éléments du tableau
    for (x <- myList) {
      println(x)
    }

    // la somme des éléments
    var total = 0.0
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    println("Total is " + total)

    // trouver le maximum
    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i)
    }
    println("Max is " + max)
  }
}

*/