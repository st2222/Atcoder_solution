fun main(args: Array<String>) {
    var cardList: MutableList<String> = mutableListOf()
    while(true){
        val line = readLine() ?: break
        cardList.add(line)
    }
    val listForJudge = listOf('a', 'b', 'c')
    
    var n = 0
    
    while(true){
        if(cardList[n].isNullOrEmpty()){
            println(listForJudge.get(n).toUpperCase())
            break
        }
        
        var tmpN = listForJudge.indexOf(cardList[n][0])
        cardList[n] = cardList[n].drop(1)
        n = tmpN
    }
}