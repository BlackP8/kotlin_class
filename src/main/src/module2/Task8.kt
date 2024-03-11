package module2

import kotlin.math.pow

fun main() {
    println("Расчет дохода по вкладу")
    println("Введите сумму вклада:")
    var sum:Double = readLine()!!.toDouble()
    println("Введите длительность вклада:")
    val duration:Int = readln().toInt()
    println("Введите годовую процентную ставку:")
    val interestRate:Double = readln().toDouble()
    var totalSum = (sum * (1 + (interestRate / 100) / 12).pow(duration))
    var monthIncome: Double
    for (n in 1..duration) {
        monthIncome = (totalSum - sum) / duration
        sum += monthIncome
        totalSum = (sum * (1 + (interestRate / 100) / 12).pow(duration))
        println("Доход от вклада в месяце $n составит: " + String.format("%.2f", monthIncome))
        println("Итоговая сумма вклада в месяце $n будет равна: " + String.format("%.2f", sum))
        println()
    }
}