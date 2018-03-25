// By name parameters
// Normal function:

def greetKalam(name: String): String = {
  println(" [Eager] ** Meet the X-president, Scientist: Shri APJ Kalam")
  println(s"\tGreetings from: $name")
  name
}

greetKalam("Neo")

def upVoteKalam(str: String):String = {
  println(s">> We Like APJ - $str")
  str
}

greetKalam(upVoteKalam("Trinity"))

// Now using 'By-name parameter'
// Be careful with functions with side-effects

def greetKalamByName (name: => String): String = {
  println(" ** [Lazy] Meet the X-president, Scientist: Shri APJ Kalam")
  println(s"\tGreetings from: $name")
  name
  name
}


greetKalamByName("Morpheus")

greetKalamByName(upVoteKalam("Cypher"))

// Prac
// Write a function to accept two lists and print out the common elements

//def getCommon[K] (xList: List[K], yList: List[K]) = {
//  val largeList = List.concat(xList, yList)
//  largeList.map(token => (token, 1))
//    .reduce(_ + _)
//
//}

// getCommon(List("abc", "ab"), List("ab", "abd"))
