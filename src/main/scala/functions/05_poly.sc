// Parametric Polymorphism

val myList = ("Hey", 2, 3, 19.0)
myList._1

val polyList = "hey" :: 2 :: 3 :: Nil
polyList(1)


val parList: List[String] = "Only" :: "Strings" :: "Allowed" :: Nil
parList(0)
parList.head
parList.tail
parList.size


// Type parameters , works only with methods

def printType[K,V] (key: K, value: V) = {
  val keyClass = key.getClass
  val valueClass = value.getClass

  println(s"Key: $key of type $keyClass")
  println(s"Key: $value of type $valueClass")

}

printType(121, "Neo")

// To convert it to function
val someFunc = printType _
// Note: It converts to type (Any, Any) which loses type safety
someFunc("Abc", 122)

// To preserve type safety mention the acceptable param list
val myPrintType = printType[Int, String] _
myPrintType(343, "neo")

//var arg with methods. this needs to be the last argument
def printStr (strs: String*): Unit = {
  for (str <- strs) {
    print(s"$str ")
  }
}

printStr("abc", "def", "ghi")

val printStr2 = printStr _
printStr2(Seq("abc", "def"))


// Procedures: Named reusable statements
// A function that does not return anything is a procedure
// doesn't take in something or return

def greetWelcome:Unit = { println("Welcome to procs")}

greetWelcome


//Methods with no inputs

// with parenthesis
def greetHello(): String = { "Hello dude"}
greetHello()
greetHello

// without parenthesis -> Procedures
def greetHi: String = { "Hi dude"}
greetHi // properties

