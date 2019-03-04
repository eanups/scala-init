// Functions vs Methods

// Methods

def addMethod(x: Int, y: Int): Int = {
  x + y
}

// Functions

val addFunction = (x:Int, y: Int) => {
  x + y
}

addMethod(2,3)
val addMethod2 = addFunction
addMethod2(3,3)

// Function : named reusable expression

val rectArea = (m: Double, n: Double) => {
  m * n
} : Double

// Method : reusable in a scope

def rectArea2 (m: Double, n: Double): Double = {
  m * n
}

// Run

rectArea(2,3)
rectArea2(2,3)

// Direct assignment possible only with functions and not methods
val someFunc = rectArea
someFunc(2,3)

//To assign methods to variables (using signature)
val someFunc2: (Double, Double) => Double = rectArea2
someFunc2(2,3)

//Second way : ETA expansion , commonly used
val someFunc2a = rectArea2 _
someFunc2a(2,3)

// Functional chaining/composing
// with functions
val getSides = (perimeter: Double) => {
  val side = perimeter / 4
  (side, side)
}

getSides(20)


(rectArea2 _).tupled(getSides(100))

//With expression blocks
(rectArea2 _).tupled({
  val side = 100 / 4; (side, side)
})


//Only with methods - named parameters: defaults
def visitPlace(name: String = "Hesarghatta", city: String = "Bangalore", zipCode: Int = 560003): (String, String, Int) = {
  println(s"Name: $name, City: $city, Postal Code: $zipCode")
  (name, city, zipCode)
}

visitPlace()
visitPlace(zipCode = 260012, name = "Neo", city = "Srinagar")
visitPlace(name="Adan", zipCode = 560055)


// Function to double a list and add

val add = (xList: List[Int]) => {
  var sum = 0
  for (i <- xList) {
    sum += i
  }
  sum
}

val doubleList = (xList: List[Int]) => {
  for (num <- xList) yield {
    num * 2
  }
}

def tripleList (xList: List[Int]) = {
  for (num <- xList) yield {
    num * 3
  }
}

add(doubleList(List(2, 3, 4, 5)))
add(tripleList(List(2, 3, 4, 5)))

/*
def adder(xL: List[Int], converter: (List[Int]) => (List[Int])  ) = {
  add(converter(xL))
}

def tripleAdder (xl: List[Int]): Int = adder(xl, tripleList)
tripleAdder(List(1 , 2, 3))

val doubleAdder = (xl: List[Int]) => adder(xl, doubleList) : Int
doubleAdder(List(1, 2, 3))
*/

// Practice

val double = (x: List[Int]) => {
  for (num <- x) yield {
    num * 2
  }
}: List[Int]

def sum = (x: List[Int]) => {
  var res = 0
  for (num <- x) {
    res += num
  }
  res
}

sum(double(List(1,3,5)))