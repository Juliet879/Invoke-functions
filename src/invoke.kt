fun main() {
    name()
    var answer = modulus(40,3)
    println(answer)
}

fun name() {
    var name = "Juliet"
    println("Hello" +" " + name)
}

fun modulus(num1:Int,num2:Int):Int {
    var remainder = num1 % num2

    return remainder
}