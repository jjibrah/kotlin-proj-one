fun main(args: Array<String>) {
    var names = arrayListOf("Karen","Tapiwa","Ephraim","Abdul","michelle")
    println(names[3])
    names.add("king")

    //use dor in loop
    for (i in 0 until names.size-1) {
        println(names[i])
    }

    //use foreach loop
    names.forEach {
        println(it)
    }
}