import kotlin.math.*

fun main(args: Array<String>) {

    println("Hello World!")

    println("Program arguments: ${args.joinToString()}")

    // Циклы. Задание 1 - Последовательность квадратов чисел
    println("_________________________Циклы. Задание 1__________________________")
    println("Введите первое чилсло")
    var a : Int = readln().toString().toInt()
    println("Введите второе чилсло")
    var b : Int = readln().toString().toInt()

    var range : IntRange = if (a < b)
        a..b
    else
        b..a

    for (i in range) {
        println("Квадрат числа $i = ${i * i}")
    }

    // Циклы. Задание 2 - Последовательность Фибоначчи
    println("_________________________Циклы. Задание 2__________________________")
    println("Введите N")
    var n : Int = readln().toString().toInt()
    println(1)
    var num_0 : Int = 0
    var num_1 : Int = 1
    var num_2 : Int = 0

    for (i in 2..n){
        num_2 = num_0 + num_1;
        num_0 = num_1;
        num_1 = num_2;

        println(num_2).toString()
    }

    // Циклы. Задание 3 - Переворот числа
    println("_________________________Циклы. Задание 3__________________________")
    print("Введите число:")
    var num = readLine().toString().toInt()

    while (num > 0){
        print(num % 10)
        num /= 10
    }
    println()

    // Циклы. Задание 4 - Удаление цифры из числа
    println("_________________________Циклы. Задание 4__________________________")
    println("Введите основное число")
    var num_main : String = readln().toString()
    println("Введите число, которое необходимо удалить")
    var num_cat : String = readln().toString()

    println("Резульат: ${num_main.replace(num_cat, "")}")

    // Циклы. Задание 5 - Гипотеза Сиракуз
    println("_________________________Циклы. Задание 5__________________________")
    println("Введите основное число")
    var sirakuza : Int = readln().toString().toInt()

    while (sirakuza != 1) {
        if (sirakuza % 2 == 0) {
            sirakuza /= 2
            println(sirakuza)
        } else if (sirakuza % 2 != 0){
            sirakuza *= 3
            sirakuza += 1
            sirakuza /= 2
            println(sirakuza)
        } else
            break
    }

    // Циклы. Задание 6 - Комбинации из трех чисел
    println("_________________________Циклы. Задание 6__________________________")
    print("Введите значение суммы 3 чисел: ")
    var S = readln().toString().toInt()
    print("Введите верхний ограничитель X (a, b, c < X):")
    var N : Double = readln().toString().toDouble()

    // Список значений от 1 до N
    var variables = (1 until N.toInt()).toList()
    // Перебор значений
    for (i in 0 until N.toInt() - 1) {
        for (j in 0 until N.toInt() - 1) {
            for (k in 0 until N.toInt() - 1) {
                if (variables[i] + variables[j] + variables[k] == S)
                    println(variables[i].toString() + variables[j].toString() + variables[k].toString())
            }
        }
    }

}