fun calc(a: Byte, b: Byte, n: Byte, m: Byte): Double {
    val c = 0
    var sum = 0.0
    for (i in a..n) {
        for (j in b..m) {
            sum += (i * j) / (i + c).toDouble()
        }
    }
    return sum
}

fun main() {
    println(calc(2, 3, 6, 5))
}
