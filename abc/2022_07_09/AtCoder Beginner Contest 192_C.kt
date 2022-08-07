//https://atcoder.jp/contests/abc201/tasks/abc192_c
fun main() {
    val (N, K) = readLine()?.split(" ")?.map { it.toLong() }?: throw Exception()
    println(calc(N, K.toInt()))
}

fun descendNumber(number: Long): Long {

    return number.toString().map { Character.getNumericValue(it) }.sorted().reversed().joinToString("").toLong()
}
fun ascendNumber(number: Long): Long {
    return number.toString().map { Character.getNumericValue(it) }.sorted().joinToString("").toLong()
}
tailrec fun calc(number: Long, count: Int): Long{

    if(count == 0){
        return number
    }
    return calc(descendNumber(number) - ascendNumber(number), count - 1)
}