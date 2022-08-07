import kotlin.math.sqrt

// https://atcoder.jp/contests/abc180/tasks/abc180_c
fun main() {
    val N = readLine()?.toLong()?: throw Exception()

    val lst = mutableListOf<Long>()

    val zero:Long = 0
    for (i in 1..sqrt(N.toDouble()).toInt()){
        if(N % i.toLong() == zero){
            lst.add(i.toLong())
            if(i.toLong() != N/i.toLong()){
                lst.add(N/i.toLong())
            }
        }
    }
    lst.sorted().forEach{println(it)}
}
