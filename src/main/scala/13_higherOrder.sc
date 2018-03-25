//Two types:
// map - functions yielding a new list
// reduce - functions that shrink lists into value/s

// foreach : takes in a procedure which does not have return value.
// foreach is a statement not an expression

val numbers = List[Int](11, 2, 31, 14, 5, 26, 7, 38, 9)
numbers.foreach(println _)


val printVal = (x: Any) => {println(x)}

numbers.foreach(printVal)

val birds = List("swan", "crow", "sparrow", "owl", "cuckoo", "White Sparrow")
// similar to foreach, map takes in a function and returns a list
numbers.map(Math.pow(_, 2))

val isSparrow = (bird: String) => { bird.toUpperCase().contains("SPARROW") }: Boolean
birds.map(isSparrow)

// takes in a predicate ( a func which returns true/false)
numbers.filter(_ % 2 != 0)

birds.filter(isSparrow)

// partition takes in a predicate, returns two lists one that satisfies
// the other which doesn't
numbers.partition(_ % 2 != 0)

birds.partition(_.toLowerCase().contains("sparrow"))

// takes in a function object and sorts by the char
// here the first char

birds.sortBy(_(0))

numbers.sortWith(_ > _) // Descending Order
numbers.sortWith(_ < _)




