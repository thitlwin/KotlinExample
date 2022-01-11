fun main() {
    println("1900 is ${isLeapYear(1900)}")
    println((2000..4000).filter { isLeapYear(it) })
}


/*A leap year is exactly divisible by 4
except for century years (years ending with 00).
The century year is a leap year only if it is perfectly
divisible by 400.*/
fun isLeapYear(year: Int): Boolean {
    return when{
        year % 4 == 0 -> when {
            year % 100 == 0 -> when {
                year % 400 == 0 -> true
                else -> false
            }
            else -> true
        }
        else -> false
    }
}
