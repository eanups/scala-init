import java.util.Calendar
// Applies to both functions and methods

// Contains an outer function & nested function object. Outer scope variables
// can be accessed within nested function even after the outer one ceases to exist.
// Closure = Nested function object + referencing env (variables local to outer scope)

def greeting(language: String): (String) => Unit = {
  language.toLowerCase() match {
    case "english" => (name: String) => println (s"Hello $name")
    case "french" => (name: String) => println (s"Bonjour $name")
    case "spanish" => (name: String) => println (s"Hola $name")
    case _ => (name: String) => println(s"Namaste $name")
  }
}

val greetInEnglish = greeting("English")
val greetInFrench = greeting("French")
val greetInSpanish = greeting("Spanish")
greetInEnglish("Neo")
greetInSpanish("Trinity")
greetInFrench("Morpheus")

// Why are closures powerful?
// They provide the ability to ship codes to different nodes to carry out functionality

def greetingWithDate(language: String): (String) => Unit = {
  val currDate = Calendar.getInstance.getTime.toString
  language.toLowerCase() match {
    case "english" => (name: String) => println (s"Hello $name. It is $currDate")
    case "french" => (name: String) => println (s"Bonjour $name. It is $currDate")
    case "spanish" => (name: String) => println (s"Hola $name. It is $currDate")
    case _ => (name: String) => println(s"Namaste $name. It is $currDate")
  }
}

val gwdInEnglish = greetingWithDate("English")
val gwdInFrench = greetingWithDate("French")
val gwdInSpanish = greetingWithDate("Spanish")
gwdInEnglish("Neo")
gwdInSpanish("Trinity")
gwdInFrench("Morpheus")