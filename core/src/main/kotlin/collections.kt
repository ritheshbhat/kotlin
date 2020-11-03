

fun main(){
    // 2 ways to initaize array
    val b = arrayOf(1,2,3)
    val a = Array<Int>(5) { i -> i * 1 }
    val c  = listOf("1",2,true) // immutable
    val d = mutableListOf<Int>(1,2) // mutable. can add or remove.
    val e = mapOf<String,Int>("rithesh" to 23) // immutable , unordered
    val f = hashMapOf<String,Int>()
    f.put("test" , 1)
    //Set maintains order
    //HashSet has unique values but order not maintained




}