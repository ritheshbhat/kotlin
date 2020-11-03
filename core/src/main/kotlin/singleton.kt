open class MotorVehicle
class Car(horsepowers: Int) : MotorVehicle()

class CarFactory(val id: Int) {
    val cars = mutableListOf<Car>()
    var name: String = "test"
    fun makeCar(horsepowers: Int): Car {
        val car = Car(horsepowers)
        cars.add(car)
        return car
    }
    constructor(id: Int, name: String):this(id){
        this.name = name

    }
    fun testName() =
    println("name is $name")
}

fun main(){
    val car = CarFactory(1, "rithesh")
    car.makeCar(100)
    println(car.name)
    val car2 = CarFactory(1)
    car2.makeCar(120)
    println(car2.name)
    println(CarFactory(1).cars.size)
}