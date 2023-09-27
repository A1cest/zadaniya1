fun main() {
    println("Введите строку из символов: ")
    val vod = readln().toInt()

    val binary: String = Integer.toBinaryString(vod)

    println(binary)
}