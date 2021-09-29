package task3.truckHandlers

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class Truck(
    private val serialNumber: Int,
    private val manufacturer: String,
    private val model: String,
    private val engine: String,
    private val releaseDate: LocalDate,
    private var isServiceable: Boolean = true
        ) {

    fun changeServiceableStatus() {isServiceable = !isServiceable}

    fun getSerialNumber(): Int {
        return serialNumber
    }
    fun printTruckInfo(){
        println("Serial Number: $serialNumber\n" +
                "Manufacturer: $manufacturer\n" +
                "Model: $model \n" +
                "Engine: $engine\n" +
                "ReleaseDate: ${releaseDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM))}\n" +
                "isServiceable: $isServiceable\n")
    }
    fun getTruckInfo() = "$serialNumber $manufacturer $model $engine $releaseDate ${isServiceable.toString()}"
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Truck

        if (serialNumber != other.serialNumber) return false

        return true
    }
    override fun hashCode(): Int {
        return serialNumber
    }
}