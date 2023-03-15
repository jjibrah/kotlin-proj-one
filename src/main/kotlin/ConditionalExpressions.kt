fun main(args: Array<String>) {
    var marks = 98
    var grade = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else if (marks > 100){
        "Invalid grade"
    }else {
        "A"
    }
    println(grade)


    var bettingNumber = 2
    var bettingResult = when(bettingNumber){
        1 -> {
            "you lost"
        }
        2 -> {
            "you won"
        }
        3 -> {
            "you lost"
        }
        4 -> {
            "you lost"
        }
        else ->{
            "please enter a number from 1-3 to bet"
        }
    }
    println(bettingResult)
    //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
}