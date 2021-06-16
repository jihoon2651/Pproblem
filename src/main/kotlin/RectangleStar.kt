import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    for (i in 0 until b) {
        for (j in 0 until a) {
            print("*")
        }
        println()
    }

}