

fun main(){
    //input eg)BBBWW
    val S = readLine() ?: throw Exception()
    val lst = mutableListOf<Char>()
    var count = 0
    for((i, s) in S.withIndex()){
        lst.add(s)
        if(i == 0){
            continue
        }
        if(lst[i-1] != s){
            ++count
        }
    }
    println(count)
}