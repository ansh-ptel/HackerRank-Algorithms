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

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val colors = ar.distinct()
    val colorQuantityMap = mutableMapOf<Int, Int>()
    var pairs = 0

    if(n == 0 || ar.isEmpty()) {
        return pairs
    }

    colors.forEach { color ->
        colorQuantityMap[color] = ar.asSequence().filter { color == it }.toList().size
    }
    colorQuantityMap.forEach {
        pairs += if (it.value % 2 == 0) {
            it.value / 2
        } else {
            (it.value - 1) / 2
        }
    }
    return pairs

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
