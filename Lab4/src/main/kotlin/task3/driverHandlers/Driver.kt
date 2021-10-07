package task3.driverHandlers

import java.util.*

class Driver {
    constructor(name: String, surname: String, drivingExperience: Int, age: Int){
        this.name = name
        this.surname = surname
        this.age = age
        this.drivingExperience = drivingExperience
    }
    private var name : String
        set(value) {field =
            value.replaceFirstChar{ if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}
    private var surname : String
        set(value) {field =
            value.replaceFirstChar{ if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}
    fun getSurname() = surname
    private var drivingExperience : Int
    fun getDrivingExperience() = drivingExperience
    private var age : Int

    fun printDriverInfo(){
        println("Name: $name\n" +
                "Surname: $surname\n" +
                "Driving Experience: $drivingExperience years \n" +
                "Age: $age\n")
    }
    fun getDriverInfo() = "$name $surname $drivingExperience $age"
}