fun main() {

    while (true) {

        var firstNumber: Int
        var secondNumber: Int

        while (true) {
            println("Введите первое число:")
            try {
                firstNumber = readLine()!!.toInt()
            } catch (e: Exception) {
                println("Ошибка. Повторите ввод.")
                continue
            }
            break
        }

        while (true) {
            println("Введите второе число:")
            try {
                secondNumber = readLine()!!.toInt()
            } catch (e: Exception) {
                println("Ошибка. Повторите ввод.")
                continue
            }
            break
        }

        var max = 0
        var number = -1

        for (i in firstNumber..secondNumber) {
            var sum = 0
            for (j in 1..i) {
                if (i % j == 0) {
                    sum += j
                }
                if (sum > max) {
                    max = sum
                    number = i
                }
            }
        }
        println("Число с наибольшей суммой делителей - $number, сумма делителей этого числа - $max.")
    }
}