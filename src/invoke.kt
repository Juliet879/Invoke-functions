fun main() {
    name()
    var answer = modulus(40, 3)
    println(answer)
    var result = add(30, 40, 70, 80)
    println(result)
    mySelf()
}

fun name() {
    var name = "Juliet"
    println("Hello" + " " + name)
}

fun modulus(num1: Int, num2: Int): Int {
    var remainder = num1 % num2

    return remainder
}

fun add(a: Int, b: Int, c: Int, d: Int): Int {
    var sum = a + b + c + d

    return sum
}

fun mySelf() {
   var intresting = "I believe in living a purposeful life and dying empty"
    println(intresting)
}