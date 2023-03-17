package oop

import kotlin.contracts.Returns

fun main(args: Array<String>) {
    var p1 = Person("jeff", "29")
    p1.setResidence("nairobi")
    println(p1.getResidence())
    p1.setSalary(1200000.0)
    println(p1.getSalary())
}
class Person(var name:String, var age:String,){
    private var salary:Double = 0.0
    private var residence:String = ""
    fun setSalary(salary:Double){
        this.salary=salary
    }
    fun getSalary():Double{
        return this.salary
    }
    fun setResidence(residence:String){
        this.residence=residence
    }
    fun getResidence():String{
        return this.residence
    }
    fun walk(){
        println("Yeah I can walk")
    }
    fun run(){
        println("Yeah I can run")
    }
}