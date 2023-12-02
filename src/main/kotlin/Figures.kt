import java.util.*


fun main() {
    println("Введите тип фигуры: ")

    var type = readln()
    type.lowercase(Locale.getDefault())
    println("Введите высоту фигуры:")
    val height = readln().toInt()
    println("Введите основание/диаметр фигуры:")
    val base = readln().toInt()

    val figure: Figure? = when (type) {
        "куб" ->  Cube(height,base)
        "пирамида" -> Pyramid(height,base)
        "конус" -> Cone(height, base)
        else -> null
    }

    println("Объем фигуры($type): ${figure?.GetVolume()}")
    println("Площадь боковой проекции: ${figure?.GetLateralProjectionArea()}")
    println("Площадь проекции сверху: ${figure?.GetTopProjectionArea()}")
}


abstract class Figure(var height: Int, var base: Int) {
    abstract fun GetVolume(): Double
    abstract fun GetLateralProjectionArea(): Double
    abstract fun GetTopProjectionArea(): Double
}

class Cone(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return Math.PI * base * base * (height / 3)
    }

    override fun GetLateralProjectionArea(): Double {
        return (height * base / 2).toDouble()
    }

    override fun GetTopProjectionArea(): Double {
        return Math.PI * base * base / 4
    }

}

class Cube(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return (height * height * height).toDouble()
    }

    override fun GetLateralProjectionArea(): Double {
        return (height * height).toDouble()
    }

    override fun GetTopProjectionArea(): Double {
        return (height * height).toDouble()
    }

}

class Pyramid(height: Int, base: Int) : Figure(height, base) {
    override fun GetVolume(): Double {
        return (height * base * base / 3).toDouble()
    }

    override fun GetLateralProjectionArea(): Double {
        return (height * base / 2).toDouble()
    }

    override fun GetTopProjectionArea(): Double {
        return (base * base) .toDouble()
    }

}
