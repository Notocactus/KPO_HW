fun main() {
    var inputArray = readLine()?.split(" ")?.toTypedArray()
    var count = 1
    if (inputArray!![0] != "") {
        for (i in 1..inputArray.size - 1) {
            if (inputArray[i-1] != inputArray[i]) {
                count += 1
            }
        }
    } else {
        count = 0
    }
    println(count)
}