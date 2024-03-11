package module2

fun main() {
    val countryInfo = arrayOf(
        arrayOf(
            arrayOf("Россия", "Москва", "Рубль"),
            arrayOf("Франция", "Париж", "Евро"),
            arrayOf("США", "Вашингтон", "Доллар")
        )
    )

    for (countryData in countryInfo) {
        for (info in countryData) {
            println("${info[0]} ${info[1]} ${info[2]}")
        }
    }
}