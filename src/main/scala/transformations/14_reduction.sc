// Scan and Family
// Scan functions take in two parameter groups as input
// Reduce function but returns a list

val nums = List(10, 20, 30, 40, 50, 60)

// Right associative
nums.scanRight(0)(_ - _)

// Left associative
nums.scanLeft(0)(_ - _)

// Random used in distributed env
nums.scan(0)(_ - _) // defaulted to scanLeft but not a must


// Fold and Family
// Fold is similar to scan but it returns the LAST operation of a scan

nums.foldRight(0)(_ - _)

nums.foldLeft(0)(_ - _)

nums.fold(0)(_ - _)


// Reduce and Family
// Similar to fold but does not take in an initial value
// Starts with the two values

nums.reduceRight(_ - _)

nums.reduceLeft(_ - _)

nums.reduce(_ - _)

// Reductions functions are powerful and used heavily in distributed systems

// Others
val weekends = List("Saturday", "Sunday")
val weekdays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

val wholeWeek = weekdays ++ weekends

wholeWeek endsWith weekends

wholeWeek startsWith weekdays

wholeWeek forall (_ contains "day")
