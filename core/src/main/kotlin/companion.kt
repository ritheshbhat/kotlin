
class Human {
    fun age():String{
        return "age func"
    }
    fun city(): String{
        return "city func"
            }
    companion object testt{
        fun test_companion(){
            print("this is static function")
        }
    }
}
fun main() {
    val a = Human()
    print("testing")
     Human.test_companion() // companion only accessed by class and not instance of class
    println(a.age())
}