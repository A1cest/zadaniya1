fun main() {
    print("Введите число n: ")
    val n = readLine()?.toInt() ?: return

    print("Введите основание степени x: ")
    val x = readLine()?.toInt() ?: return

    var y = 0
    var result = 1
    while (result < n) {
        y++
        result *= x
    }

    if (result == n) {
        println("Показатель степени y = $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}