val scientists = ("Faraday", "Einstein", "Hawking", "Newton")
scientists._1 //indexed starting 1

val pair = "Aditi" -> "Anup"
pair.swap

val keyVal = 122 -> "Employee X"
keyVal._2

val newton_info = ("Isaac", "Newton", 34, 1342323, "M")
val (firstName, lastName, age, credits, gender) = newton_info

// ignore age and salary
val (fName, lName, _, _, sex) = newton_info


// Tuples iterator
newton_info.productIterator.foreach { i => println (s"Val: $i")}

newton_info.productArity // count or length

// Passing tuples to functions

val nameAgeSteve = "Stephen" -> 72
val nameAgeTesla = "Nikola" -> 28

def nameAgeInfo(name: String, age: Int) = {
  println(s"Name: $name\t Age:$age")
}

(nameAgeInfo _).tupled(nameAgeSteve)
(nameAgeInfo _).tupled(nameAgeTesla)

// Tuples adhere to traits .. they don't fall under Collections.
// They are immutable
