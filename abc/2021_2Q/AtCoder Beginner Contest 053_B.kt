fun main() {
    //HASFJGHOGAKZZFEGA
    val str = readLine()

    var count = 0
    var flag = false
    var result = 0
    if (str != null) {
        for (s in str) {
            when(s){
                'A' -> {
                    flag = true
                    count++
                }
                'Z' -> if(flag){count++;result=count}
                else ->  if (flag){count++}
            }
        }
    }
    println(result)
}