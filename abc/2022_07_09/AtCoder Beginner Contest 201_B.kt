//https://atcoder.jp/contests/abc201/tasks/abc201_b
fun main() {
    val N = readLine()?.toLong()?: throw Exception()

    var dict = mutableMapOf<String, Long>()

    for (i in 0 until N){
        val (k, v) = readLine()?.split(" ")?: throw Exception()
        dict[k] = v.toLong()
    }
    println(dict.toList().sortedBy { it.second }.reversed()[1].first)
}
