fun main() {
    println(convertBinaryToDecimal(110110111))
    println(convertDecimalToBinary(19))
    println(convertDecimalToBinaryWithFormal(19))
}

fun convertBinaryToDecimal(binaryDigit: Long): Int{
    var i = 0
    var decimalValue = 0L
    var dividend = binaryDigit
    if (dividend > 0) {
        while (dividend > 0) {
            var remainder = dividend % 10
            var quotient = dividend / 10
            decimalValue += remainder * (Math.pow(2.0, i.toDouble())).toLong()
            dividend = quotient
            i++
        }
    }
    println(Integer.toBinaryString(decimalValue.toInt()))
    return decimalValue.toInt()
}

// shorthand (informal)
fun convertDecimalToBinary(decimalValue: Int): Int {
    var binaryStr = ""
    var dividend = decimalValue
    while (dividend > 0) {
        binaryStr = "${dividend % 2}$binaryStr"
        dividend /= 2 // quotient
    }
    return binaryStr.toInt()
}

// formal
fun convertDecimalToBinaryWithFormal(decimalValue: Int): Long {
    var i = 1
    var binaryNumber: Long = 0;
    var dividend = decimalValue
    while (dividend > 0 ) {
        binaryNumber += dividend % 2 * i
        i *= 10
        dividend /= 2
    }
    return binaryNumber
}