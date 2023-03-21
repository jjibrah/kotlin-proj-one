fun main(args: Array<String>) {
    avg(34, 424.0)
    avg(323, 424.0, 676.0)

}

fun avg(x:Int, y:Double){
    var answer = (x + y )/ 2.0
    println("Results fom avg1 is $answer")
}
fun avg(x:Int, y:Double, z:Double){
    var answer = (x + y + z )/ 3.0
    println("Results form avg2 $answer")
}
