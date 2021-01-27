fun main() {
    val str:String? = readLine()
    var digit: Int
    when (str){
        "one" -> digit = 1
        "two" -> digit = 2
        "three" -> digit = 3
        "four" -> digit = 5
        "zero" -> digit = 0
        else -> {
            print("Wrong string")
            return
        }
    }
    println(digit)


}