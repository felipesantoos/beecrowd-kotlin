import java.util.*

fun main(args: Array<String>) {
    areaOfACircle()
}

fun helloWorld1000() {
    println("Hello, World!")
}

fun extremelyBasic1001() {
    val scanner = Scanner(System.`in`)
    val a: Int = scanner.nextInt()
    val b: Int = scanner.nextInt()
    val x = a + b

    println("X = $x")
}

fun areaOfACircle() {
    val scanner = Scanner(System.`in`)
    val pi = 3.14159
    val r = scanner.nextDouble()
    val a = pi * r * r
    println("A=%.4f".format(a))
}
