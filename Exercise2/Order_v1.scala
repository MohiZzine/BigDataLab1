class Order(orderId: Int, orderDate: String, orderCustomerId: Int, orderStatus: String) {
  println("Je suis dans le constructeur")
  override def toString =
    "Order(" + orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + ")"
}

object Demo {
  def main(args: Array[String]): Unit = {
    // create object
    var order = new Order(1, "2013-10-01 00:00:00.00", 100, "COMPLETE")

    // print it using toString
    println(order.toString)

    // Try to access an attribute (this will cause an error if uncommented)
    // println(order.orderId) // error: value orderId is not a member of Order
  }
}
