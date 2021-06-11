/**
 *
 *
 *
 *
 *
 *
 */

fun fun1() {}
class Fight {
    lateinit var x:String
    fun fun2() {
        this::x.isInitialized
        fun fun3() {
            fun fun4() {

            }
        }
    }
}

fun <T, R> Collection<T>.fold(initial: R, combine: (acc: R, nextElement: T) -> R): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

val items = listOf(1, 2, 3, 4, 5)
val add11: (Int, Int) -> Int? = { a: Int, b: Int ->
    a + b
}
val add1 = fun(a: Int, b: Int): Int {
    return a + b
}

typealias plus = (Int, Int) -> Int

fun main() {
//    items.fold(0) { acc: Int, i: Int ->
//        print("acc = $acc,i = $i")
//        val result = acc + i
//        print("result = $result")
//        result
//    }
    //print(add(1, 2))
}