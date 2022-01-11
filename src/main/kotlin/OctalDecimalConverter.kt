fun main() {
    println("Oct(116) to Decimal(${convertOctalToDecimal(116)})")
    println("Dec(78) to Oct(${convertDecimalToOctal(78)})")
}

fun convertDecimalToOctal(decimalNum: Int): Int {
    var dividend = decimalNum
    var i = 1
    var octalValue = 0
    while (dividend > 0) {
        octalValue += dividend % 8 * i
        dividend /= 8
        i *= 10
    }
    return octalValue
}

fun convertOctalToDecimal(octalNum: Int): Int {
    var decimalVal = 0
    var dividend = octalNum
    var i = 0.0;
    while (dividend > 0){
        var remainder = dividend % 10
        decimalVal += remainder * (Math.pow(8.0, i)).toInt()
        i++
        dividend /= 10
    }
    return decimalVal
}