
class Person<A>(val name: A, val age: Int){
    fun personName() : A { return name }
    fun personAge() :Int = age
}

class City<C>(val cityName: C){
    fun cityName(): C = cityName
}

class TestInheritance<D,E>(val person: D, val city: E){
    fun personDefinition() = person
    fun cityDefinition() = city
}
fun main(){
    val rithesh : Person<String> = Person("rithesh",25)
    val udupi : City<String> = City("udupi")
    val testUser : TestInheritance<Person<String>,City<String>> = TestInheritance(rithesh,udupi)
    val testUserRes = testUser.personDefinition()
    testUserRes.personName()
    testUser.cityDefinition().cityName()
}