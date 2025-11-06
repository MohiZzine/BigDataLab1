file:///C:/Users/farid/OneDrive/Desktop/Lab1_MohieddineFarid/Introduction/PatternMatching.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:
	 -Person.
	 -Person#
	 -Person().
	 -scala/Predef.Person.
	 -scala/Predef.Person#
	 -scala/Predef.Person().
offset: 718
uri: file:///C:/Users/farid/OneDrive/Desktop/Lab1_MohieddineFarid/Introduction/PatternMatching.scala
text:
```scala
// object Demo {
//   def main(args: Array[String]) {
//     println(matchTest(3))
//   }

//   def matchTest(x: Int): String = x match {
//     case 1 => "one"
//     case 2 => "two"
//     case _ => "many"
//   }
// }

object Demo {
  def main(args: Array[String]) {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println("Age: " + age + " year, name: " + name + "?")
      }
    }
  }

  case class Pe@@rson(name: String, age: Int)
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 