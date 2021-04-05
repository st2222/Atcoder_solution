fun main(args: Array<String>){
    var input = readLine()
    val N = input?.length as Int

    var sum: Long = 0
    var tmp = ""
    var tmpSum = ""

    for(bit in 1..(1 shl N-1)){
        for(i in 0..N-2){
            tmp += input.get(i)?.toString()
            if(bit and (1 shl i) != 0){
                tmpSum += tmp
                tmp = ""
                tmpSum += "+"
            }
        }
        tmp += input.get(N-1)?.toString()

        tmpSum += tmp
        sum += tmpSum.split("+").map{x -> x.toLong()}.foldRight(0L){x, y -> x + y}
        tmp = ""
        tmpSum = ""
    }
    println(sum)
}