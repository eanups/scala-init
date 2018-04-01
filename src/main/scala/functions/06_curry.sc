// Nested methods

def calcCircle(radius: Double): (Double, Double) = {
  val PI = 3.14
  def area() = { PI * radius * radius }
  def circumference() = 2 * PI * radius
  (area(), circumference())
}

calcCircle(3)
calcCircle(2)


// 1 - Function as a parameter
def xCompare(s1: String, s2: String,
             compFn: (String, String) => Int): Int = {
  compFn(s1, s2)
}

xCompare("aiti", "aiti", (m:String, n:String) => {m.compareTo(n)}: Int)


// 2 - Function as a return value
def superCompare(rev: Boolean): (String, String) => Int = {

  val compareAsc = (s1: String, s2: String) => {
    if (s1 == s2) 0
    else if (s1 > s2) -1
    else 1
  }: Int

  def compareDesc(s1: String, s2: String):Int = {
    if (s1 == s2) 0
    else if (s1 > s2) 1
    else -1
  }

  if (rev) compareDesc
  else compareAsc
}

xCompare("aditi", "anup", superCompare(rev = true))
xCompare("aditi", "musi", superCompare(rev = false))

val compDescending = superCompare(true)
compDescending("aditi", "anup")


// Place holders
val  isSquare = (l: Double, m: Double) => {
  l == m
}: Boolean

isSquare(3, 3)

val areaRectangle = (len:Double , breadth: Double, isSq: (Double, Double) => Boolean) => {
  if (isSq(len, breadth))  s"Square Area: ${Math.pow(len, 2)}"
  else s"Rectangle Area: ${len * breadth}"
}: String

areaRectangle(3, 4, isSquare)
areaRectangle(3, 3, isSquare)

areaRectangle(3, 4, (l: Double, m: Double) => {l == m})

// Using place holders
areaRectangle(5, 6, _ == _)



def calcRectangleArea(len: Double, breadth: Double,
                      isSq: (Double, Double) => Boolean): Double = {
  if (isSq(len, breadth)) len * len
  else len * breadth
}


// Partially Applied Functions

// Fix on the function
val defaultCompare = xCompare(_:String, _:String, superCompare(false))
defaultCompare("aditi", "anup")

//Fix on a value
val aditiCompare = xCompare("aditi", _:String, _:(String, String) => Int)
aditiCompare("aditi", compDescending)



// Currying:

def curryCompare(s1: String, s2:String) (cfn:(String, String) => Int) = {
  println("Using currying")
  cfn(s1, s2)
}


curryCompare ("aditi", "anup") (compDescending)


def curry2Compare (cfn: (String, String) => Int) (s1:String, s2:String) = {
  cfn(s1, s2)
}

val curryWithNames = curry2Compare(_: (String, String) => Int) ("aditi", "anup")
curryWithNames(compDescending)

val curryWithComp = curry2Compare(compDescending)(_:String, _:String)
curryWithComp("anup", "aditi")