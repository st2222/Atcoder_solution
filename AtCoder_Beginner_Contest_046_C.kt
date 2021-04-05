//　切り上げ処理とDouble型,Long型に注意、小数点以下の計算の時にバグる
//　Long型からIntにするときに桁落ちしたりする大きい値がくるときはLong！！
fun main(){
    val N = readLine()?.toInt() ?: 0

    var (tt, aa) = readLine()!!.split(" ").map{it.toLong()}

    for (i in 0..N-2){
        var(t, a) = readLine()?.split(" ")?.map{
            it.toLong()
        }?.toMutableList()?:throw Exception()
        var x = Math.max((tt+t-1)/t, (aa+a-1)/a)
        tt = t*x
        aa = a*x
    }
    println(tt+aa)
}