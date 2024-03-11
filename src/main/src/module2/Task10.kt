package module2

fun main() {
    val cities: MutableList<String> = mutableListOf()
    doTask10(cities)
}

private fun doTask10(cities: MutableList<String>) {
    println()
    println("Выберите действие:")
    println("1. Добавить название города")
    println("2. Посмотреть список всех добавленных городов")
    println("3. Посмотреть список добавленных городов без повторений")
    println("4. Выход")
    val option:String = readLine().toString()

    when (option) {
        "1" -> {
            println("Введите название города:")
            val city: String = readLine() ?: ""
            cities.add(city)
            doTask10(cities)
        }
        "2" -> {
            if (cities.isEmpty()) {
                println("Список городов пуст")
            } else {
                println("Список всех городов:")
                for (city in cities) {
                    println(city)
                }
            }
            doTask10(cities)
        }
        "3" -> {
            if (cities.isEmpty()) {
                println("Список городов пуст")
            } else {
                println("Список всех городов без повторений:")
                for (city in cities.distinct()) {
                    println(city)
                }
            }
            doTask10(cities)
        }
        "4" -> {
            return
        }
        else -> {
            println("Вы выбрали некорректное действие")
            doTask10(cities)
        }
    }
}

