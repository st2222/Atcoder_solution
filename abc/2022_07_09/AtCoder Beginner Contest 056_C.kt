//https://atcoder.jp/contests/abc056/tasks/arc070_a
fun main() {
    val X = readLine()?.toLong()?: throw Exception()
    var i = 0
    var p = 0
    while (X > p){
        i++
        p += i
    }
    println(i)
}
