val myFirstLambda : ( Int , Int) -> Int = {a : Int,b : Int ->
    println("testing multiline lambdas")
    println("a - b is ${a-b}")
    a+b }

val mySecondLambda : ( Int , Int) -> Unit = {a : Int,b : Int ->
    println("testing multiline lambdas")
    println("a - b is ${a-b}")
    a+b }


fun calculator(a: Int, b: Int , action: (Int, Int) -> Int) : Int{
    println("args are ${a}, $b")
    return action(a, b)
}
fun closurecalculator(a: Int, b: Int , action: (Int, Int) -> Unit) : Unit {
    println("args are ${a}, $b")
    return action(a, b)
}
// in the lamda body the input arg should not be enclosed in paranthesis. example { (a : Int , b: Int -> ... )} instead
//just use {a: Int , b : Int -> ... }

//we can also pass lamda to a function by taking it out of `()`
// example: insteaf of calculator(a,b,action: (Int, Int ) -> Int ) we can write calculator(a,b){ (Int,Int) -> Int }

//tODO in kotlin we can change state of outside variables from within lambda, but not possible in java.

fun reverseAString(s: String, block : ( String) -> String ) : String = block(s)

fun main(){
    var result = 0

    println(myFirstLambda(2,3))
    println(calculator(2,3,myFirstLambda))
    //testing second way
    println(calculator(2,3){ a , b  -> a + b })
    //testing closures
    println("result before changes by lamda $result")
    closurecalculator(2,3){x,y -> result = x + y}
    println("result after changes in lambda $result")
    val s = "hello"
    println("reversing $s")
    println(reverseAString(s){ ss : String -> ss.reversed()})
    // if there is only args as input to lamda we can replace the arg with `it`
    // it will be equal to s -> s.
    println(reverseAString(s){
        it.reversed()
    })

}