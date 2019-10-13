import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    if(s.isBlank() || n == 0) {
        return 0
    }
    var valleys = 0
    var currentLevel = 0
    s.forEach { step ->
        if(step == 'U') {
            currentLevel++
        } else if(step == 'D') {
            currentLevel--
        }
        if(currentLevel == 0 && step == 'U') {
            valleys++
        }
    }
    return valleys

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
