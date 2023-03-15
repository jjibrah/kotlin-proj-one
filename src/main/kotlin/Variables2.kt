fun main(args: Array<String>) {
    var x:Int
    val y:Int

    x=20
    x=30
    println(x)

    y=40
    println(y)

    //simple interest calculation
    var principle = 100000
    var rate = 2.5
    var time = 5
    var interest = (principle*rate*time)/100
    println("your simple interest $interest")

    //calculating the volume of a cylinder
    var radius = 2.8
    var height = 100
    var volume = (3.142*radius*radius*height)
    println("the volume of the cylinder is $volume")
}