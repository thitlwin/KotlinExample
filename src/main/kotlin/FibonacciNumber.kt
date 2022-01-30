fun main() {
    var res:List<Int> = generateFibonacciNumber(30)
    println(res.joinToString())
}

fun generateFibonacciNumber(limit: Int): List<Int> {
    var n1 = 0
    var n2 = 1
    var result = listOf<Int>(0,1)
    while (n2 <= limit) {
        var sum = n1 + n2
        if (sum > 30) break
        result += sum
        n1 = n2
        n2 = sum
    }
    return result
}
