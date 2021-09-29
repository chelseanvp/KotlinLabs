package task3
import task3.Dispatcher.AutoBase.drivers
import task3.Dispatcher.AutoBase.truckTrips
import task3.Dispatcher.AutoBase.trucks
import task3.driverHandlers.Driver
import task3.truckHandlers.Truck
import task3.truckTripsHandlers.TruckTrip
import java.io.File
import java.time.LocalDate

open class Dispatcher : BinarySearch{
    fun findTruckBySerialNumber(serialNumber: Int) { binarySearchTruck(serialNumber, trucks)?.printTruckInfo() }
    fun printAllTrucks(){ trucks.forEach { it.printTruckInfo() } }
    fun saveTruckToFile(){
        File("Trucks.txt").bufferedWriter().use { out ->
            trucks.forEach {out.write("${it.getTruckInfo()}\n")}
        }
    }
    fun changeServiceableStatus(serialNumber: Int) {
            binarySearchTruck(serialNumber, trucks)?.changeServiceableStatus()
            println("Status changed!")
    }

    fun printAllDrivers(){ drivers.forEach{it.printDriverInfo()} }
    fun findDriverByDrivingExperience(drivingExperience : Int) {
        binarySearchDriver(drivingExperience, drivers)?.printDriverInfo()}

    fun findDriverBySurname(surname : String) : Driver?{
        drivers.forEach{
            if(it.getSurname() == surname) return it
        }
        return null
    }
    fun saveDriverToFile(){
        File("Drivers.txt").bufferedWriter().use { out ->
            drivers.forEach {out.write("${it.getDriverInfo()}\n")}
        }
    }
    fun printAllTruckTrips(){ truckTrips.forEach{it.printTruckTripInfo()}}

    object AutoBase : Dispatcher(), BinarySearch {
        val trucks = mutableListOf<Truck>()
        val drivers = mutableListOf<Driver>()
        val truckTrips = mutableListOf<TruckTrip<String>>()
        init{
            File("Trucks.txt").readLines().forEach {
                val result = it.split(" ")
                trucks.add(Truck(result[0].toInt(),result[1],result[2],result[3],LocalDate.parse(result[4]),result[5].toBoolean()))
            }
            File("Drivers.txt").readLines().forEach {
                val result = it.split(" ")
                drivers.add(Driver(result[0],result[1],result[2].toInt(),result[3].toInt()))
            }
        }
        fun addTruckTrip(departurePoint : String, destination: String, surname: String, serialNumber: Int){
            val driver = findDriverBySurname(surname)
            val truck = binarySearchTruck(serialNumber, trucks)
            if(driver != null && truck !=null){
                truckTrips.add(TruckTrip(departurePoint,destination,truck,driver))
                println("Truck Trip successfully added!")
            }
            else println("Truck or Driver didn't find!")
        }
        fun addDriver(name: String,surname: String,drivingExperience: Int, age: Int){
            drivers.add(Driver(name, surname, drivingExperience, age))
            drivers.sortBy { Driver -> Driver.getSurname()}
            println("Driver successfully added!")
        }
        fun addTruck(
            serialNumber: Int,
            manufacturer: String,
            model: String,
            engine: String,
            releaseDate: LocalDate
        ): Boolean {
            val truck = Truck(serialNumber, manufacturer, model, engine, releaseDate)
            trucks.forEach {
                if (it.getSerialNumber() == truck.getSerialNumber()) {
                    println("A truck with the same serial number already exists!")
                    return false
                }
            }
            trucks.add(truck)
            trucks.sortBy { Truck -> Truck.getSerialNumber() }
            println("Truck successfully added!")
            return true
        }
    }
}