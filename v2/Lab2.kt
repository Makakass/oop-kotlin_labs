fun constMulMatrix(a: Int, matrix: Array<DoubleArray>): Array<DoubleArray> {
    for (line in matrix) {
        line.forEachIndexed { index, element -> line[index] = element * a }
    }
    return matrix
}

fun sumMinElemColumn(matrix: Array<DoubleArray>): Double {
    val results = DoubleArray(matrix[0].size) { i -> Double.MAX_VALUE }
    for (line in matrix) {
        line.forEachIndexed { index, element -> if (element < results[index]) results[index] = element }
    }
    return results.sum()
}

fun main() {
    val B = arrayOf(
        doubleArrayOf(1.0, 10.0, 3.0),
        doubleArrayOf(4.0, 5.0, 6.0),
    )
    val C = constMulMatrix(3, B)
    val sum = sumMinElemColumn(C)

    println("Result matrix:")
    for (line in C) {
        println(line.contentToString())
    }
    println("\nSum of min columns values: $sum")
}
