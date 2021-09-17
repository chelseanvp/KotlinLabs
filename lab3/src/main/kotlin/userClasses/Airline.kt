package userClasses

import java.util.*

class Airline(
    placeOfArrival : String,
    placeOfDispatch : String,
    flightNumber : Int,
    planeType : String,
    departureTime: Double,
    departureDays:MutableList<String>)
{

    var placeOfDispatch : String = ""
        set(value){
            field = value.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()}
        }

    var placeOfArrival : String = ""
        set(value){
            field = value.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()}
        }
    var flightNumber : Int = 0
        set(value) {
            field = when{
                value <= 0 -> 1
                value > 1000 -> 1000
                else -> value
            }
        }

     var planeType : String = ""
        set(value) {
            val types = listOf("small","medium","large")
            field = if(types.contains(value)) value else "Undefined"
        }

    var departureTime : Double = 0.0
    set(value){
        field = when{
            value in 00.00..24.00 -> value
            value < 00.00 -> 00.00
            else -> 24.00
        }
    }

    var departureDays : MutableList<String> = mutableListOf()
    set(value) {
        val daysOfTheWeeks = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        field = mutableListOf()
            value.forEach{
                if(daysOfTheWeeks.contains(it)) field.add(it) else field = mutableListOf("Undefined")
            }
    }

    init{
        this.placeOfArrival = placeOfArrival
        this.placeOfDispatch = placeOfDispatch
        this.flightNumber = flightNumber
        this.planeType = planeType
        this.departureTime = departureTime
        this.departureDays = departureDays
    }

    fun printAirline(){
        println("| Place of Arrival: $placeOfArrival " +
                "| Place of Dispatch: $placeOfDispatch" +
                "| Flight number: $flightNumber " +
                "| Plane type: $planeType " +
                "| Departure Time: $departureTime " +
                "| Departure days: $departureDays |")

    }
}