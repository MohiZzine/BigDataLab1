class Order2(val orderId: Int, val orderDate: String, val orderCustomerId: Int, val orderStatus: String) {
  println("Je suis dans le constructeur")
  override def toString =
    "Order(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + ")"
}

object Demo2 {
  def main(args: Array[String]): Unit = {
    val order = new Order2(1, "2013-10-01 00:00:00.00", 100, "COMPLETE")

    // now possible: attributes are accessible
    println(order.toString)
    println("Order ID: " + order.orderId)

    // try to modify a field (uncomment next line to see compile error)
    // order.orderId = 2  // ❌ reassignment to val
  }
}
