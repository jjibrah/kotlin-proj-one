fun main(args: Array<String>) {
    motto()
    add()
    avg(200, 500.0, 800.0f)
    avg(500, 300.0, 600.0f)
    println(sam(20, 40))
}

fun motto(){
    println("Hello there this is our motto")
}

fun add(){
    var x = 10
    var y = 20
    var z = x + y
    println("Hello there you answer is $z")
}

fun avg(x:Int, y:Double, z:Float){
    var average = (x + y + z) /3.0
    println("your answer is $average")
}

fun sam(x:Int, y:Int):Int{
    var answer = x + y
    return answer
}