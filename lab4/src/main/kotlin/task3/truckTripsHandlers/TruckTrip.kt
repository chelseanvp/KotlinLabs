package task3.truckTripsHandlers

import task3.driverHandlers.Driver
import task3.truckHandlers.Truck

class TruckTrip<T> (
    private val departurePoint : T,
    private val destination: T,
    private val truck: Truck,
    private val driver: Driver,) {
    fun printTruckTripInfo(){
        println("_______________________________________")
        println("Departure Point: $departurePoint\n" +
                "Destination: $destination\n")
        println("Driver: ")
        driver.printDriverInfo()
        println("Truck: ")
        truck.printTruckInfo()
        println("----------------------------------------")
    }
}
