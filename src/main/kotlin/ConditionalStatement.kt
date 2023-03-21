fun main(args: Array<String>) {
    //IF STATEMENT
    var age = 672
    if (age < 18){
        println("Sorry you are underage")
    }else if(age in 50 ..109){
        println("Sorry you are overage")
    }else if (age>110){
        println("Please enter a valid age")
    }
    else{
        println("welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi<=18){
        println("underweight")
    }else if(bmi<=29){
        println("normal weight")
    }else if (bmi<=34){
        println("overweight")
    }
    else{
        println("obese")
    }


    //WHEN SATTEMENT
    var bettingNumber = 3
    when(bettingNumber){
        1->{
            println("You lost")
        }
        2->{
            println("You lost")
        }
        3->{
            println("You won")
        }
        4->{
            println("You lost")
        }
        else->{
            println("Pleae enter a number from 1-4 to bet")
        }
    }
}