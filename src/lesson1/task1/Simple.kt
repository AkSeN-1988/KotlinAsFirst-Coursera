@file:Suppress("UNUSED_PARAMETER")
package lesson1.task1

import kotlin.math.*

/**
 * Пример
 *
 * Вычисление квадрата целого числа
 */
fun sqr(x: Int) = x * x

/**
 * Пример
 *
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double) = x * x

/**
 * Пример
 *
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
 * Пример
 *
 * Поиск одного из корней квадратного уравнения
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
        (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Пример
 *
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

/**
 * Пример главной функции
 */
fun main(args: Array<String>)
//{
//    val result = sqr(7)
//    println("7 * 7 = $result")
//}
//{
//    val result = angleInRadian(grad = 36, min = 14, sec = 35)
//    println("angleInRadian = $result")
//}
//
//{
//    val result = lengthInMeters(8, 2, 11)
//    println("lengthInMeters = $result")
//}
//{
//    val result = thirdDigit(3801)
//    println("thirdDigit = $result")
//}
//
//{
//    val result = travelMinutes(9, 25, 13, 1)
//    println("travelMinutes = $result")
//}
//
{
    val result = numberRevert(478)
    println("numberRevert = $result")
}

/**
 * Тривиальная
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    val oneSec = 1
    val oneMin = oneSec * 60
    val oneHours = oneMin * 60
    val sec = (hours * oneHours) + (minutes * oneMin) + seconds
    return sec
}

/**
 * Тривиальная
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double {
    val oneVershoks = 4.445
    val oneArshins = (48 * oneVershoks) / 3
    val oneSagenes = oneArshins * 3
    val metre = ((oneSagenes * sagenes) + (oneArshins * arshins) + (oneVershoks * vershoks)) / 100
    return metre
}

/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(grad: Int, min: Int, sec: Int): Double {
    val oneGrad = PI / 180
    val oneMin = PI / (180 * 60)
    val oneSec = PI / (180 * 60 * 60)
    val radian = (grad * oneGrad) + (min * oneMin) + (sec * oneSec)
    return radian
}

/**
 * Тривиальная
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val length = sqrt(sqr(x2 - x1) + sqr(y2 - y1))
    return length
}

/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
fun thirdDigit(number: Int): Int {
    val x1 = number / 100
    val x2 = x1 % 10
    return x2
}

/**
 * Простая
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val oneMinutes = 1
    val oneHours = oneMinutes * 60
    val timeDepart = (hoursDepart * oneHours) + (minutesDepart * oneMinutes)
    val timeArrive = (hoursArrive * oneHours) + (minutesArrive * oneMinutes)
    val travelTime = timeArrive - timeDepart
    return travelTime
}

/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double {
    val x1 = (1 + (percent / 100.0))
    val x2 = x1.pow(3) * initial
    return x2
}

/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int {
    val x1 = number % 10
    val x2 = number / 10
    val x3 = x2 % 10
    val x4 = x2 / 10
    val x5 = (x1 * 100) + (x3 * 10) + x4
    return x5
}
