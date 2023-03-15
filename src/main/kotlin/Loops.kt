fun main(args: Array<String>) {
    //WHILE LOOPS
        //while loop
    var counterOne = 0
    while (counterOne <=5){
    println(counterOne)
    counterOne++
    }
        //do while loop( it first prints then checks for the condition)
    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    }while (counterTwo <=15)

//////////////////////////////////////////////////////////////////

    //FOR LOOPS
        //for in loop
    for (number in 20..25) {
        println(number)
    }
    for (num in 50 downTo 45){
        println(num)
    }
        //for each loop
    var names = listOf("Josiah", "James","Lorna","Juma","Victoria")
    names.forEach{
        println(it)
    }

////////////////////////////////////////////////////////////////
    //REPEAT LOOPS
    repeat(5){
        println("Hello world")
    }
}