fun main() {

    val (K, S) = readLine()?.split(" ")?.map { it.toLong() } ?: throw Exception()

    var count = 0
    for (i in 0 until K + 1) {
        for (j in 0 until K + 1) {
            val k = (S - (i + j))
            if (k in 0..K) {
                count++
            }
        }
    }
    println(count)
}