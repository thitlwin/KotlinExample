fun main() {
    var start = 20
    var end = 50
    var primeNumber = (start..end).filter { isPrimeNumber(it) }.toList()
    println(primeNumber.joinToString())
}

fun isPrimeNumber(num: Int): Boolean {
    for (i in 2..num/2) { // reduce half
        if (num % i == 0)
            return false;
    }
    return true;
}
