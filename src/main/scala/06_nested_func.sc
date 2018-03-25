// Nested methods

def calcCircle(radius: Double): (Double, Double) = {
  val PI = 3.14
  def area() = { PI * radius * radius }
  def circumference() = 2 * PI * radius
  (area(), circumference())
}

calcCircle(3)
calcCircle(2)

// Higher Order functions/methods
// 1 - takes in a function as parameter
// 2 - or returns a function as return value

// 1 -
def xCompare(s1: String, s2: String,
             compFn: (String, String) => Int): Int = {
  compFn(s1, s2)
}

xCompare("aiti", "aiti", (m:String, n:String) => {m.compareTo(n)}: Int)


// 2 -
def compareAsc(s1: String, s2: String):Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else 1
}

def compareDesc(s1: String, s2: String):Int = {
  if (s1 == s2) 0
  else if (s1 > s2) 1
  else -1
}

def compareNone(s1: String): String = {
  s1
}

compareAsc("aditi", "anup")
compareDesc("aditi", "anup")

def superCompare(rev: Boolean): (String, String) => Int = {
  if (rev) compareDesc _
  // else if (rev == null) compareNone _
  else compareAsc _ // ETA expansion
}

xCompare("aditi", "anup", superCompare(rev = true))
xCompare("aditi", "anup", superCompare(rev = false))

val compFn = superCompare(true)
compFn("aditi", "anup")


// Place holders
val  isSquare = (l: Double, m: Double) => {
  l == m
}: Boolean

isSquare(3, 3)

val areaRectangle = (len:Double , breadth: Double, isSq: (Double, Double) => Boolean) => {
  if (isSq(len, breadth)) len * len
  else len * breadth
}: Double

areaRectangle(3, 4, isSquare)
areaRectangle(3, 3, isSquare)
areaRectangle(3, 4, (l: Double, m: Double) => {l == m})
// Using place holders
areaRectangle(5, 4, _ == _)

// Doesn't work
/** areaRectangle(5, 4,
  {
    val l = _ ;
    val b = _ ;
    println (s"len:$l")
    println (s"breadth:$b")
    false
  }
) */




def calcRectangleArea(len: Double, breadth: Double, isSq: (Double, Double) => Boolean): Double = {
  if (isSq(len, breadth)) len * len
  else len * breadth
}


// Partially Applied Functions

// Fix on the function
val defaultCompare = xCompare(_:String, _:String, superCompare(true))
defaultCompare("aditi", "anup")


val aditiCompare = xCompare("aditi", _:String, _:(String, String) => Int)
aditiCompare("aditi", compFn)



// Currying:

// Parameter Groups : Divide into groups and fix on one group
// F(x, y, z) = G( H(x, y), z)

def curryCompare(s1: String, s2:String) (cfn:(String, String) => Int) = {
  println("Using currying")
  cfn(s1, s2)
}


curryCompare ("aditi", "anup") (compFn)


def curry2Compare (cfn: (String, String) => Int) (s1:String, s2:String) = {
  cfn(s1, s2)
}

val curryWithNames = curry2Compare(_: (String, String) => Int) ("aditi", "anup")
curryWithNames(compFn)

val curryWithComp = curry2Compare(compFn)(_:String, _:String)
curryWithComp("anup", "aditi")