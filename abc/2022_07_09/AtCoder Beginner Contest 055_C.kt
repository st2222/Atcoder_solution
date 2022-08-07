// https://atcoder.jp/contests/abc055/tasks/abc055_c
fun main() {
    // 149696127901
    val (N, M) = readLine()?.split(" ")?.map{it.toLong()}?: throw Exception()

    var result: Long = 0;
    if(N * 2 == M){
        result = M
    }else if(N * 2 > M){
        result = M / 2
    }else{
        result = N
        result += (M - N * 2) / 4
    }
    println(result)
}
