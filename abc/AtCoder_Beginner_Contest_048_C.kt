fun main(){
    val (N, x) = readLine()?.split(" ")?.map { it.toLong() } ?: throw Exception()
    val row = readLine()?.split(" ")?.map { it.toLong() }?.toMutableList() ?: throw Exception()
    var count = 0L

    for(i in 0 until row.size -1){
        if(i == 0) {
            if(x < row[i]){
                val result = (row[i] - x)
                row[i] = x
                count += result
            }
        }
        if(x < row[i+1] + row[i]){
            val result = (row[i+1] + row[i] - x)
            row[i+1] -= result
            count += result
        }
    }
    print(count)
}
