
// Statements are that do not return a value
var x = 10
val y = 343

// Expressions are something that do return a value
"Hi Neo"
x + y

//Consider the example
val diam = {val PI = 3.14; 2 * PI * x}
// where 2 * PI * x is an expression
// between curly braces is an expression block

val area =
{
  val PI = 3
  println ("Outer scope PI: " + PI)
  PI * x * x; // Useless expression
  {
    val PI = 3.14274
    println("Inner scope PI: " + PI)
    PI * x * x
  }
  // PI * x * x
}


// Functions are reusable expression blocks

val isX = false
// If Else expressions
if (isX)
  x

// Match expressions : similar to switch

val day = "thursday"

val feeling = day.toLowerCase match {
  case "monday"|"2" => "Monday Blues"
  case "sunday" => "Sunday holiday!"
  case "tuesday"|"wednesday"|"thursday" => "Workday!" // OR-ed expr
  case someDay if someDay == "friday" => "TGIF" // Pattern guards
  case someDay if someDay == "saturday" => "Sizzling Saturday";
//  case someDay => {
//    println("No Match: Its some other day!")
//    someDay
  case _ => { // catch-all with match-all
    println(s"Error: $day not present")
  }
}
// massive spreadsheets



val radius: Any = 10.0

val typeRadius = radius match {
  case radius:Int => s"Integer: $radius"
  case radius:String => s"String: $radius"
  case radius:Float => s"Float: $radius"
  case _:AnyRef => "Any Reference"
  case _:Any => "Any "

}

var days:List[String] = List("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
// Yield avoids boiler plate code and by collecting the values and returning a list.
for (day <- days) yield {
  day match {
    case "Mon" =>  "Meeting"
    case "Tue" => "Discussion"
    case "Fri" => "Whelm"
    case "Sat"|"Sun" => "Off"
    case _ =>  "Work day:" + day
  }
}


// Value binding to/until
for (i <- 0 until days.size) {
  print(days(i) + " ")
}

for(day <- days if day == "Mon") {
  println("Manic Monday")
}

// Nested for loops
for { day <- days
      i<-0 until 3} {
  println (s"Day: $day - $i")
}

// while , do-while are pure statements.

