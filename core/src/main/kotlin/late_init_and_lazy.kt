
class Mumbai{
    lateinit var name: String
    val test_lazy : String by lazy {
        "i am lazy initializer"
    }

    fun test_lateinit(): String{
        return "lateinit is $name "
    }

    fun test_lazy(): String {
        return "memory is allocated to test_lazy variable only when this method has been invoked. value of variable is $test_lazy"
    }
}

fun main(){
    val mi = Mumbai()
    // lateinit defined variables must always be defined before accessing them.
    // it can be defined at run time.

    //lazy keyword is used for saving of memory of ununsed variables
    // lazy shud be assigned with only vals
    mi.name = "mumbai indians test"
    println(mi.name)
    println(mi.test_lateinit())
    println("testing lazy initialization")
    println(mi.test_lazy())
}