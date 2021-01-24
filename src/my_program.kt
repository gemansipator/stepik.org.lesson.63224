fun calcTax(sum:Int = 1000): Double{
    val tax_ratio = 0.13

    return tax_ratio*sum
}

fun main() {
    val sum_user: String? = readLine()

    if (sum_user == null) return   //Если значение пустое, то возвратит return и покинет функцию ТОЧКА ВХОДА
    // и приложение завершится
    var sum:Int = sum_user.toInt() //Конвертация из строки в число
    val tax:Double = calcTax(sum)  // Выполнит функцию calcTax, аргументом в которой станет переменная sum

    println("For ${sum} ${tax}")

}