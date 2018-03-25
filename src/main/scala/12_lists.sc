// Lists are singly linked list and are immutable
// End of list :  Nil of type List[Nothing]

// common way to create list = using cons :: operator

val weekend = "Sat" :: "Sun" :: Nil // gets chained from right (Nil) to left(Sat)

val weekends = List("Saturday", "Sunday")
val weekdays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

// Concat using ++ (Traversable collections) or ::: (only on lists)

val wholeWeek = weekdays ++ weekends
val fullWeek:List[String] = weekdays ::: weekends

val weekIndices:List[Int] = List(1, 2, 3, 4, 5, 6, 7)

// zip
weekIndices zip fullWeek
val week:List[(String, Int)] = weekdays zip weekIndices

// flatten
val daysIn = List(weekdays, weekends)
val weekIn = daysIn.flatten

weekIn.head // first

weekIn.last // last

weekIn.tail // except the first

weekIn contains "Chunday" // operator notation
weekIn.contains("Friday") // in-fix dot notation

// for loops
for (day <- weekIn)
  println(day)

// Unique or distinct values
val dupWeekDays = weekIn ::: List("Monday", "Wednesday")
dupWeekDays.distinct


// Drop
weekIn.drop(3)

weekIn dropRight 3


// Slice
weekIn.slice(2,4)

// Split
weekIn.splitAt(3)

// Take
weekIn.take(2)

// Sort
weekIn.sorted


// sum , max, product, min
weekIndices.sum
weekIndices.max

weekIn.product //no o/p
weekIn.sum // no o/p
weekIn.min // no o/p
weekIn.max






