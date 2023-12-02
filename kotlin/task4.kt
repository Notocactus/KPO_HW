fun main() {
    val size = readLine()?.toInt()
    var arr = Array(size!!) { Array<Int>(size!!) { 0 } }
    for (i in 0..size - 1) {
        for (j in 0..size - 1) {
            arr[i][j] = (0..10).random()
            print(arr[i][j])
            print(" ")
        }
        print('\n')
    }

    var sum = 0
    for (i in 1..size - 1) {
        for (j in 0..i - 1) {
            sum += arr[i][size - 1 - j]
        }
    }
    println(sum)
}