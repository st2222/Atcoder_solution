import kotlin.math.abs

//https://atcoder.jp/contests/abc201/tasks/abc201_b
fun main() {
    val N = readLine()?.toInt()?: throw Exception()

    val planList = mutableListOf<List<Int>>()
    val timeList = mutableListOf<Int>()

    for (i in 0 until N){
        val (t, x, y) = readLine()?.split(" ")?.map { it.toInt() }?: throw Exception()
        planList.add(listOf(x, y))
        timeList.add(t)
    }
    // 地点から地点の２次元の移動距離が時間の差分より大きいと不可能
    // 移動距離と時間の差分が上記を満たしており、偶数、奇数同士なら可能
    // N回全て可能なら可能
    var flag = true
    for (i in 0 until N){
        if(i == 0){
            if(timeList[i] < planList[i][0] + planList[i][1] || !detectEvenOdd(timeList[i],planList[i][0] + planList[i][1])){
                flag = false
            }
            continue
        }
        val difference = abs((planList[i - 1][0] - planList[i][0])) + abs((planList[i - 1][1] - planList[i][1]))
        val time = timeList[i] - timeList[i - 1]
        if(time < difference || !detectEvenOdd(time, difference)){
            flag = false
        }

    }
    if(flag) println("Yes") else println("No")
}

fun detectEvenOdd(a: Int, b: Int): Boolean{
    return (a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)
}