open class Tournament(val totalTeams: Int) {
    init {
        println("inside tournament class")
    }

    fun totalTeams() = "there are ${totalTeams} in this year's tournament"
    open fun home_ground(): String {
        return "rcb plays their matches in bangalore"
    }

    open fun finals(city: String): String = "finals will be played in $city"
}

//TODO class needs to be made open to make it available for inheritance
class Rcb(val overseasCount: Int, supportStaff: Int, coach: String, totalTeams: Int) :
        Tournament(totalTeams) {
    init {
        println("initializing RCB Class")
    }

    //TODO as the home_ground function names are there in
    // both parent and child, we need to include a overide modifier
    // indicating that we are changing implementation in child class.
    //parent class should have open modifier for the function so that we can overide in child.

    override fun home_ground(): String = "bangalore"

    //TODO to have the same implementation of parent class in child class. we can use super keyword along with the function name ( which needs to have sample impl in child class)
    override fun finals(city: String): String = super.finals(city).also {
        println("calling parent func ")
    }

}

fun main() {
    val test = Tournament(8)
    println(test.totalTeams())
    println(test.home_ground())
    println(test.finals("wankade"))

    val rcb = Rcb(8, 12, "mike hesson", 10)
    println(rcb.totalTeams())
    println(rcb.home_ground())
    println(rcb.finals("dubai"))

}