
System.out.print("Hello Neo, Welcome to the real World")

print ("Hey!")

val PI: Double = 3.142
var area: Double = 343.343

val res: Double = PI * area
print(res)

// Statically Typed but has powerful Type Inference.

val abc = res * 3
print (abc)

var side = "My Side"
var len = 3
var myLen: Double = 3
// var myDouble: Int = 3.0 #Error
// var myStr: Double = "1.0" # Error
// Python like dynamic, Java like type check

//Strings
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
s"Hey, my song: ${str}${delim*4}$str "

f"PI val: $PI%.2f "

// Unified Type System

def printAny(msg: Any) = println(msg)

printAny(3)
printAny("Neo")
printAny(3.35)

val someVal = 5
val someRef = new Object

printAny(someVal)
printAny(someRef)

def printAnyRef(msg: AnyRef) = println("Ref:" + msg)

def printAnyVal(msg: AnyVal) = println("Value: " + msg)

printAnyRef(someRef)
printAnyVal(someVal)

val nullObj = null  // null object of Null Trait
val myList = List() // List of Nothing Trait
// Nil is associated to a list
val anList = List(1,3,4)
var listIter = anList.iterator

// Option is a collection associated with an Option. Type safe way to test
def fraction(num: Double, denom: Double):Option[Double] = {
  if (denom == 0) None
  else Option (num/denom)
}

fraction(22, 0)
fraction(22, 7)

// 123.13.asInstanceOf[Long]
123.asInstanceOf[Long]
124.343.toLong
"1232.34".toFloat
// "2343.343".toInt # NumberFormatException

3433434343433L.isInstanceOf[Long]

"3434".getClass
List(8,6).getClass





