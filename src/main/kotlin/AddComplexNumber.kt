data class Complex(internal var real: Double, internal var imag: Double)

fun main() {
    var c1 = Complex(10.0,40.0)
    var c2 = Complex(20.0,30.0)
    var res: Complex
    res = add(c1, c2)
    System.out.printf("Sum = %.1f + %.1fi", res.real, res.imag)
}

fun add(c1: Complex, c2: Complex): Complex {
    var complex = Complex(0.0, 0.0)
    complex.real = c1.real + c1.real
    complex.imag = c1.imag + c2.imag
    return complex
}
