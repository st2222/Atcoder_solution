//https://atcoder.jp/contests/abc201/tasks/abc197_b
fun main() {
    val (H, W, X, Y) = readLine()?.split(" ")?.map { it.toInt() }?: throw Exception()

    var sList = mutableListOf<List<String>>()

    for (i in 0 until H){
        sList.add(readLine()?.toCharArray()?.map { it.toString() }?: throw Exception())
    }
    var count = 1
    var xflag = true
    for(i in X-1 downTo 0){
        var yflag = true
        for(j in Y-1 downTo 0){
            if(i != X-1){
                continue
            }
            if(j + 1 != Y && sList[i][j] == "." && yflag){
                count ++
            }else if(j + 1 == Y){
            }else{
                yflag = false
            }
        }
        if(i + 1 != X && sList[i][Y-1] == "." && xflag) {
            count++
        }else if(i + 1 == X){
        }else{
            xflag = false
        }
    }
    xflag = true
    for(i in X-1 until H){
        var yflag = true
        for(j in Y until W){
            if(i != X-1){
                continue
            }
            if(sList[i][j] == "." && yflag){
                count ++
            }else{
                yflag = false
            }
        }
        if(i == X-1){
            continue
        }
        if(sList[i][Y-1] == "." && xflag) {
            count++
        }else{
            xflag = false
        }
    }

    println(count)

}
