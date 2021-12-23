fun main() {
    //5
    //IIDID
    val N = readLine()?.map { it.toLong() } ?: throw Exception()
    val str = readLine()

    var count = 0
    var max = 0
    if (str != null) {
        for (s in str) {
            count += when(s){
                'I' -> 1
                'D' -> -1
                else -> throw Exception()
            }
            if(count > max){
                max = count
            }

        }
    }
    println(max)
}