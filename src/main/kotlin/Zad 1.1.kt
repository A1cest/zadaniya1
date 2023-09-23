fun main() {
    val input = readLine() ?: return
    val occurrences = StringBuilder()

    var count = 1
    val n = input.length
    var i = 1

    while (i < n) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            occurrences.append(input[i - 1])
            if (count > 1) {
                occurrences.append(count)
            }
            count = 1
        }
        i++
    }

    occurrences.append(input[i - 1])
    if (count > 1) {
        occurrences.append(count)
    }

    println(occurrences.toString())
}
