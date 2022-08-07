import kotlin.math.pow

// 2022/07~
// https://atcoder.jp/contests/abc055/tasks/abc055_b
fun main() {
    // 149696127901
    val N = readLine()?.toInt()?: throw Exception()

    var result:Long = 1
    for (i in 1..N){
        if(i == 1){
            continue
        }
        result *= i
        result %= (10.toDouble().pow(9) + 7).toLong()
    }
    println(result)
}
