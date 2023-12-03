fun main() {
    val input = readLine()
    val strs = input?.split(" ")?.toTypedArray()
    val name = strs?.get(strs.size - 1)
    for (i in 1..3) {
        println(name)
    }
}