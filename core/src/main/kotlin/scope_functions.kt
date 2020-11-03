
class Chennai(){
    val name: String = "CSK"
    val age: String = "8"
}
fun main(){
    val chennaiSuperKngs = Chennai()
    println(chennaiSuperKngs.name)
    println(chennaiSuperKngs.age)
    //every time we are referencing to object. we can use with operator to avoid this
    val result = with(chennaiSuperKngs){
        println(this.name)
        // can exclude this too.
        println(age)
        // this lamda returns the last execution statement
        "testing return of with scope"
    }
}