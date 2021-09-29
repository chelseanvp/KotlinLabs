package task3.driverHandlers

import task3.Dispatcher

fun actionsWithDrivers(){
    Dispatcher.AutoBase
    do {
        printDriverMenu()
        when (readLine()) {
            "1" -> addDriver()
            "2" -> Dispatcher().printAllDrivers()
            "3" -> findDriverByDrivingExperience()
            "4" -> Dispatcher().saveDriverToFile()
            "0" -> break
            else -> println("Wrong input!")
        }
    }while (true)
}
fun addDriver(){
    val dispatcher = Dispatcher.AutoBase
    print("Name: ")
    val name = readLine()
    print("Surname: ")
    val surname = readLine()
    print("Driver Experience: ")
    val driverExperience = readLine()?.toInt()
    print("Age: ")
    val age = readLine()?.toInt()
    if (name != null && surname != null && driverExperience != null && age !=null)
    dispatcher.addDriver(name,surname,driverExperience,age)
    else println("Wrong Input!")
}
fun findDriverByDrivingExperience(){
    print("Enter Driving Experience (how many years): ")
    val drivingExperience = readLine()?.toInt()
    if (drivingExperience != null) Dispatcher().findDriverByDrivingExperience(drivingExperience)
}
fun printDriverMenu(){
    println("#1 Add driver")
    println("#2 Print all drivers")
    println("#3 Find driver")
    println("#4 Save drivers")
    println("#0 Exit")
    print("Enter operation number: ")
}