
fun isOdd(x : Int): Boolean =
    x%2 != 0
val a=listOf(1,2,3)

fun main(){
    val b = 4
    val num = listOf(1,2,3,4)
    println(num.filter(::isOdd))
    println(::a.get())
}