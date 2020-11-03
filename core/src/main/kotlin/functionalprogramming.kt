

fun addition(a: Int, b: Int): Int = a + b

class TestFuncReference : (Int, Int) -> Int{
    override fun invoke(a: Int, b: Int) : Int = addition(a,b)
}
fun main(){
    val sum : (Int, Int) -> Int = ::addition
    println("the sum is a function reference to addition now")
    println(sum(5,6))
    val obj = TestFuncReference()
    obj.invoke(2,2)

}