val nameCodes = Map(
  "JA" -> "John Anderson",
  "PP" -> "Peter Parker",
  "TS" -> "Tony Stark",
  "BW" -> "Bruce Wayne"
)
nameCodes

nameCodes("JA")

try {
  nameCodes("II")
} catch {
  case e: Exception => "No Such Element"
}

nameCodes.contains("II")

nameCodes.foreach(
  (name:(String,String)) => println(name._1 + " = " + name._2)
)

nameCodes.map(
  (name:(String, String)) => (name._1.toLowerCase(), name._2)
)

// List to Map

val codes = List("IN", "US", "NZ", "SA")
val countries = List("India", "United States", "New Zealand", "South Africa")

val countryCodes = (codes zip countries).toMap

val newCodes = countryCodes.keys.toList
val nCodes = countryCodes.keySet // Unordered 

val newCountries = countryCodes.values.toList



