
System.out.print("Hello Neo, Welcome to the real World")

print ("Hey!")

val PI: Double = 3.142
var area: Double = 343.343

val res: Double = PI * area
print(res)

// Statically Typed but has powerful Type Inference.

val abc = res * 3

val st = "abc "
print (st * 3)

print (abc)

var side = "My Side"
var len = 3
var myLen: Double = 3

// var myDouble: Int = 3.0 #Error
// var myStr: Double = "1.0" # Error
// Python like dynamic syntax, Java like type check

// Strings
val str = "But " + "it " + "rained!"
val song =
  """
    There goes
    a
    multi-line
    song..
  """

val x = 1
str == song
val delim = " "

// String Interpolation
s"Hey, my song: $str${delim * 4}$str "

f"PI val: $PI%.1f "

// Practice 23Feb19

val chimp="Flint"
var action: String = "had bananas"
val morningNum: Int = 1
val eveningNum: Int = 3
val dv: Double = 3.0
val lineSep: Char = '_'
val carriage: Char = '\n'

print (s"${lineSep * 30}\n$chimp, $action: $morningNum in the morning, " +
  s"$eveningNum in the evening. $carriage This continued for the whole week." +
  s"$carriage Total bananas consumed: ${(morningNum + eveningNum) * 7} $carriage")




