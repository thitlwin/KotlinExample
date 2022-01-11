fun main() {
    println("is 153 isArmStrongNumber(number)= ${isArmStrongNumber(153)}")
    println("is 1634 isArmStrongNumber(number)= ${isArmStrongNumber(1634)}")
    println("is 0 isArmStrongNumber(number)= ${isArmStrongNumber(0)}")
    println("is 1 isArmStrongNumber(number)= ${isArmStrongNumber(1)}")
    println("is 2 isArmStrongNumber(number)= ${isArmStrongNumber(2)}")
    println("is 9 isArmStrongNumber(number)= ${isArmStrongNumber(9)}")
    println("is 407 isArmStrongNumber(number)= ${isArmStrongNumber(407)}")

    println((0..500).filter { isArmStrongNumber(it) })
}

fun isArmStrongNumber(number: Int): Boolean {
    var digitList = number.toString().toList()
    var digitLength = digitList.size
    var sumResult = 0.0
    for (num in digitList){
        sumResult += Math.pow(num.toString().toDouble(), digitLength.toDouble())
    }
    return sumResult.toInt() == number
}
