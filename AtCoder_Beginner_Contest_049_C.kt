fun main(){
    val S = readLine()?.reversed()?: throw Exception()

    val words = mutableListOf("maerd", "remaerd", "esare", "resare")

    var T = ""

    var tmpStr = ""

    for(s in S){
        tmpStr += s
        if (tmpStr in words){
            T += tmpStr
            tmpStr = ""
        }
    }

    if (S.reversed() == T.reversed()) println("YES") else println("NO")
}