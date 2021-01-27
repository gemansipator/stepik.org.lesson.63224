//Находим количество нулей (можно сделать ЛЮБОЙ СИМВОЛ) введенных в командной строке 

fun main() {
    val str:String? = readLine()
    var zeros_cont: Int = 0;
    if (str == null) return
    for (c in str){
        if (c == '0') zeros_cont++
    }
    print("${zeros_cont} zeros")

}