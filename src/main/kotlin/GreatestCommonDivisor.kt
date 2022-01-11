fun main() {
    println("gcd(81, 200) = ${gcd(81, 153)}")
    println("lcm(81, 200) = ${lcm(81, 153)}")
    println("lcm(72, 120) = ${lcm(72, 120)}")
    println("lcmWithoutGcd(72, 120) = ${lcmWithoutGcd(72, 120)}")
}

fun gcd(n1: Int, n2: Int): Int {
    var i = 1
    var gcd = 1
    while (i <= n1 && i <= n2) {
        if(n1 % i == 0 && n2 % i == 0)
            gcd = i
        i++;
    }
    return gcd
}

fun lcm(n1: Int, n2: Int): Int {
    return n1 * n2 / gcd(n1, n2)
}

fun lcmWithoutGcd(n1: Int, n2: Int): Int {
    var lcm =if ( n1 > n2) n1 else n2
    while (true) {
        if (lcm % n1 ==0 && lcm % n2 ==0){
            return lcm
        }
        lcm++
    }
    return lcm
}