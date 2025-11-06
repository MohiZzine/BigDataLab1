import scala.io.Source

object OrderItemsMapReduce {
  def main(args: Array[String]): Unit = {

    // Read all lines from file into a List[String]
    val orderItems = Source.fromFile("part-00000").getLines.toList

    // Example: print the first line to check structure
    println("First record: " + orderItems(0))

    // Filter only productId == 2
    val orderItemsFilter = orderItems.filter(orderItem =>
      orderItem.split(",")(1).toInt == 2
    )

    // Map each record to the 5th field (index 4) as Float
    val orderItemsMap = orderItemsFilter.map(orderItem =>
      orderItem.split(",")(4).toFloat
    )

    // Reduce to sum the prices
    val totalRevenue = orderItemsMap.reduce((total, price) => total + price)

    println("Total price for Product ID 2 = " + totalRevenue)
  }
}
