package oop

fun main(args: Array<String>) {
    //Inheritance and polymorphism
    var studentOne = Student("Jared", "jared@gmail.com", "jared123")
    var studentTwo = Student("Ephraim", "Ephraim@gmail.com", "Ephraim123")
    println(studentOne.name)
    studentTwo.register()

    var teacherOne = Teacher("King", "king@gmail.com", "king123")
    var teacherTwo = Teacher("Erik", "Erik@gmail.com", "Erik123")
    println(teacherOne.name)
    teacherTwo.register()
    teacherOne.suspendStudent()


    var headTeacherOne = Headteacher("ken", "ken@gmail.com", "ken123")
    println(headTeacherOne.name)
    headTeacherOne.register()
    headTeacherOne.suspendStudent()
    headTeacherOne.approveCash()
}

open class Student(open var name:String,open var  email:String,open var  password:String){

    fun register(){
        println("you registered with email: $email and password: $password")
    }
    fun login(){
        println("You logged in with this email: $email and this password: $password")
    }
}
open class Teacher(name:String,email:String, password:String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah I can suspend a student")
    }
}
class Headteacher(name:String,email:String, password:String):Teacher(name, email, password){
    fun approveCash(){
        println("Yeah I can approve cash")
    }
}