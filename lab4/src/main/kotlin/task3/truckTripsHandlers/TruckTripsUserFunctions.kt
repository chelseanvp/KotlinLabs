package task3.truckTripsHandlers

import task3.Dispatcher

fun actionsWithTruckTrips(){
    Dispatcher.AutoBase
    do {
        printTruckTripMenu()
        when (readLine()) {
            "1" -> addTruckTrip()
            "2" -> Dispatcher().printAllTruckTrips()
            "0" -> break
            else -> println("Wrong input!")
        }
    }while (true)
}

fun addTruckTrip(){
    val dispatcher = Dispatcher.AutoBase
    print("Departure point: ")
    val departurePoint = readLine()
    print("Destination: ")
    val destination = readLine()
    print("Driver surname: ")
    val surname = readLine()
    print("Truck serial number: ")
    val serialNumber = readLine()?.toInt()
    if(departurePoint != null && destination != null && surname != null && serialNumber != null )
    dispatcher.addTruckTrip(departurePoint, destination, surname, serialNumber)
    else println("Wrong input!")
}
fun printTruckTripMenu(){
    println("#1 Add truck trip")
    println("#2 Print all truck trips")
    println("#0 Exit")
    print("Enter operation number: ")
}