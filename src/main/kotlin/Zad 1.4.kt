fun main() {
    print("Введите два числа и символ операции, разделяя их пробелом: ")
    val input = readLine()?.split(" ") ?: return

    if (input.size != 3) {
        println("Некорректный ввод")
        return
    }

    val num1 = input[0].toDouble()
    val num2 = input[1].toDouble()
    val operator = input[2][0]

    if (num1 == null || num2 == null) {
        println("Некорректные числа")
        return
    }

    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> {
            println("Некорректная операция")
            return
        }
    }

    println("Результат: $result")
}