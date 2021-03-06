// Unified Type System

def printAny(msg: Any) = println(msg)

printAny(3)
printAny("Neo")
printAny(3.35)

val someVal = 5
val someRef = new Object

printAny(someVal)
printAny(someRef)

def printAnyRef(msg: AnyRef) = println("*Ref: " + msg)

def printAnyVal(msg: AnyVal) = println("=Value: " + msg)

printAnyRef(someRef)
printAnyVal(someVal)

val nullObj = null  // null object of Null Trait
val myList = List() // Empty List of Nothing Trait

// Nil is associated to a list
val anList = List(1,3,4)
val an2List = 1 :: 3 :: 4 :: Nil
anList == an2List

var listIter = anList.iterator

// Option is a collection associated with Some type or None. Type safe way to test
def fraction(num: Double, denom: Double):Option[Int] = {
  if (denom == 0) None
  else Option ((num/denom).asInstanceOf[Int])
}

fraction(22, 0)
fraction(22, 7)

123.13.asInstanceOf[Long]
123.isInstanceOf[Int]
123.asInstanceOf[Long]
124.343.toLong
"1232.34".toFloat
// "2343.343".toInt # NumberFormatException

3433434343433L.isInstanceOf[Long]

"3434".getClass
List(8,6,2,18).getClass

// Practice

def splitter(obj: Any, splits:Int, comment: String = "!") : Option[AnyVal] = {
  if (obj.isInstanceOf[Int])
    Option(obj.asInstanceOf[Int] / splits)
  else if (obj.isInstanceOf[Long])
    Option(obj.asInstanceOf[Long] / splits)
  else {
    print("more to come..")
    None
  }
}

splitter(15, 3, "integer splits")
splitter(333.33, splits = 3, "float splits")