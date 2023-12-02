abstract class Figure (val type : String, val height : UInt, val len : UInt) {
//    abstract val Type : String
//    abstract val Height : UInt
//    abstract val Len_diam : UInt

    abstract fun ToString() : String
    abstract fun V() : Double
    abstract fun OrtArea() : Double
    abstract fun TopArea() : Double
}

open class Cube (type : String, height : UInt, len : UInt) : Figure (type, height, len) {
//    override val Type: String
//        get() = TODO("Not yet implemented")
//    override val Height: UInt
//        get() = TODO("Not yet implemented")
//    override val Len_diam: UInt
//        get() = TODO("Not yet implemented")

    override fun ToString() : String {
        return "\nОбъем куба: ${V()} \nПлощадь боковой проекции: ${OrtArea()} \nПлощадь проекции сверху: ${TopArea()}"
    }

    override fun V() : Double {
        return (len * len * height).toDouble()
    }

    override fun OrtArea(): Double {
        return (len * height).toDouble()
    }

    override fun TopArea(): Double {
        return (len * len).toDouble()
    }
}

open class Pyramid (type : String, height : UInt, len : UInt) : Figure (type, height, len) {
    override fun ToString() : String {
        return "\nОбъем пирамиды: ${V()} \nПлощадь боковой проекции: ${OrtArea()} \nПлощадь проекции сверху: ${TopArea()}"
    }

    override fun V() : Double {
        return (len * len * height).toDouble() / 3
    }

    override fun OrtArea(): Double {
        return (len * height).toDouble() / 2
    }

    override fun TopArea(): Double {
        return (len * len).toDouble()
    }
}

open class Cone (type : String, height : UInt, len : UInt) : Figure (type, height, len) {
    override fun ToString() : String {
        return "\nОбъем конуса: ${V()} \nПлощадь боковой проекции: ${OrtArea()} \nПлощадь проекции сверху: ${TopArea()}"
    }

    override fun V() : Double {
        return kotlin.math.PI * (len * len * height).toDouble() / 3
    }

    override fun OrtArea(): Double {
        return (len * height).toDouble() / 2
    }

    override fun TopArea(): Double {
        return kotlin.math.PI * (len * len).toDouble()
    }
}