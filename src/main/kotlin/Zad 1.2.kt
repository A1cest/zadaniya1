
fun main(){
println("Введите строку из символов: ")
    val string = readLine().toString()
    val a = HashMap<Char,Int>()
    for (char in string){
        if (a.containsKey(char)){
        a[char] = a[char]!!+1
        } else {
            a[char] = 1
        }
    }
    val sorted = a.keys.sorted()
    for (char in sorted) {
        println("$char - ${a[char]}")
    }
}