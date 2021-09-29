package task3

import task3.driverHandlers.Driver
import task3.truckHandlers.Truck

interface BinarySearch {
    fun binarySearchTruck(serialNumber:Int,trucks : MutableList<Truck>): Truck? {
        var l = 0
        var r = trucks.size
        if(trucks[0].getSerialNumber() == serialNumber) return trucks[0]
        while (r > l) {
            val m: Int = (l + r) / 2
            if (trucks[m].getSerialNumber() < serialNumber) {
                l = m + 1
            } else if (trucks[m].getSerialNumber() > serialNumber) {
                r = m - 1
            } else {
                return trucks[m]
            }
        }
        return null
    }
    fun binarySearchDriver(drivingExperience : Int,drivers : MutableList<Driver>): Driver? {
        var l = 0
        var r = drivers.size
        if(drivers[0].getDrivingExperience() == drivingExperience ) return drivers[0]
        while (r > l) {
            val m: Int = (l + r) / 2
            if (drivers[m].getDrivingExperience() < drivingExperience) {
                l = m + 1
            } else if (drivers[m].getDrivingExperience() > drivingExperience) {
                r = m - 1
            } else {
                return drivers[m]
            }
        }
        return null
    }
}