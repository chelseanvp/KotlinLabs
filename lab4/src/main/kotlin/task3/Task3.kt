package task3
import task3.driverHandlers.actionsWithDrivers
import task3.truckHandlers.actionsWithTrucks
import task3.truckTripsHandlers.actionsWithTruckTrips

fun task3(){
    do{
        printMenu()
        when(readLine()){
            "1" -> actionsWithTrucks()
            "2" -> actionsWithDrivers()
            "3" -> actionsWithTruckTrips()
            "0" -> break
            else -> println("Wrong input!")
    }
    }while (true)
    print("Good bye!")
}

fun printMenu(){
    println("#1 Trucks")
    println("#2 Drivers")
    println("#3 Truck trips")
    println("#0 Exit")
    print("Enter operation number: ")
}