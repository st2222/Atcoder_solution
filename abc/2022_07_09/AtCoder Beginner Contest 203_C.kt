//https://atcoder.jp/contests/abc203/tasks/abc203_c
fun main() {
    val (N, K) = readLine()?.split(" ")?.map { it.toLong() }?: throw Exception()

    var map = mutableMapOf<Long, Long>()

    var result: Long = 0
    for (i in 0 until N){
        var (A, B) = readLine()?.split(" ")?.map { it.toLong() }?: throw Exception()
        if(i != 0.toLong() && map.contains(A)){
            map[A] = map[A]?.plus(B)?: throw Exception()
        }else{
            map[A] = B
        }
    }
    val mapList = map.toSortedMap().toList()
    for (i in mapList.indices){
        if (i == 0){
            if(mapList[i].first!! > K){
                result = K
                break
            }else{
                result = K + mapList[i].second
                continue
            }
        }
        if(mapList[i].first > result){
            break
        }else{
            result += mapList[i].second
        }
    }
    println(result)
}
