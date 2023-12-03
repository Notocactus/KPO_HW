fun main() {
    print("Введите тип фигуры: ")
    var type = readLine()
    print("Введите высоту фигуры: ")
    var height = readLine()?.toUInt()!!
    print("Введите основание фигуры: ")
    var len = readLine()?.toUInt()!!

    var fig : Figure
    when (type) {
        "Куб" -> {
            fig = Cube(type, height, len)
            print(fig.ToString())
        }
        "Пирамида" -> {
            fig = Pyramid(type, height, len)
            print(fig.ToString())
        }
        "Конус" -> {
            fig = Cone(type, height, len)
            print(fig.ToString())
        }
        else -> println("\nНу... нет")
    }
}