package oop


fun main(args: Array<String>) {
    //These are objects
    var f1 = Fruit("Mango", "Yellow", "200g", 30.0 )
    var f2 = Fruit("Apple", "Red", "150g", 40.0 )
    println(f1.name)
    println(f2.color)


    var gari1 = Car("Audi","KDD 999T",4500000.0)
    var gari2 = Car("Subaru","KDL 888C",3200000.0)
    gari1.brake()
    gari2.accelerate()
    println( gari2.reg_no)
}
//This is a class
class Fruit(name:String, color:String, size:String, price:Double){
    var name:String
    var color:String
    var size:String
    var price:Double
    //Initialise the properties
    init {
        this.name = name
        this.color = color
        this.size = size
        this.price = price
    }
//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
}

class Car(model:String, reg_no:String, price:Double){
    var model:String
    var reg_no:String
    var price:Double

    init {
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    // These are class functions
    fun accelerate(){
        println("Yeah I am a $model and I can smoke you")
    }
    fun brake(){
        println("i am a $model and I can break")
    }
}
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
