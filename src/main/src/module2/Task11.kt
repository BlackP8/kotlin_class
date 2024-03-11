package module2

fun main() {
    val workPlaces:MutableMap<Int, String> = mutableMapOf(
        1 to "Иванов Иван Иванович",
        2 to "Петров Павел Сергеевич",
        3 to "Кузнецов Виктор Евгеньевич",
        4 to "Самойлов Валентин Владимирович"
    )
    doTask11(workPlaces)
}

private fun doTask11(workPlaces: MutableMap<Int, String>) {
    println()
    println("Выберите действие:")
    println("1. Добавить рабочее место")
    println("2. Узнать ФИО сотрудника по ID рабочего места")
    println("3. Выход")
    val option:String = readLine().toString()
    val placeNumber: Int
    val workerName: String

    when (option) {
        "1" -> {
            println("Добавление рабочего места")
            println("Введите номер рабочего места:")
            try {
                placeNumber = readln().toInt()
                println("Введите ФИО сотрудника:")
                workerName = readLine() ?: ""
                workPlaces[placeNumber] = workerName
                println("Рабочее место добавлено!")
                doTask11(workPlaces)
            } catch (e: NumberFormatException) {
                println("Номер рабочего места некорректен! Повторите операцию")
                doTask11(workPlaces)
            }
        }
        "2" -> {
            println("Поиск сотрудника по ID рабочего места")
            println("Введите ID рабочего места:")
            try {
                placeNumber = readln().toInt()
                if (workPlaces[placeNumber].isNullOrBlank()) {
                    println("Сотрудник не найден")
                    doTask11(workPlaces)
                } else {
                    println("Искомый сотрудник:")
                    println(workPlaces[placeNumber])
                    doTask11(workPlaces)
                }
            } catch (e: NumberFormatException) {
                println("Номер рабочего места некорректен! Повторите операцию")
                doTask11(workPlaces)
            }
        }
        "3" -> {
            return
        }
        else -> {
            println("Вы выбрали некорректное действие")
            doTask11(workPlaces)
        }
    }
}