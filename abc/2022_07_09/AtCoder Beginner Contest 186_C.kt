// https://atcoder.jp/contests/abc186/tasks/abc186_c
fun main() {
    val N = readLine()?.toInt()?: throw Exception()

    val lst = mutableListOf<Int>()

    for (i in 1..N){
        if (makeOctal(i).contains("7") || i.toString().contains("7")){
            lst.add(i)
        }
    }
    println(N - lst.size)
}


fun makeOctal(number: Int): String{

    val divisor = 8

    val stack = mutableListOf<Int>()

    var syou = number
    while(true){
        val amari = syou % divisor
        syou /= divisor
        stack.add(amari)
        if(syou == 0){
            break
        }
    }
    val lst = arrayListOf<Int>()
    for (i in stack.reversed()){
        lst.add(i)
    }
    return lst.joinToString("")
}