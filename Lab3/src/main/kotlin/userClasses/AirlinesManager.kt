package userClasses

import java.io.File

object AirlinesManager {
    private var listOfAirlines : MutableList<Airline> = mutableListOf()

    private fun addAirline(airline : Airline){
        listOfAirlines.add(airline)
    }

    fun printAirlines(){
        listOfAirlines.forEach{
            it.printAirline()
            println("----------------------------------")
        }
    }

    fun findByPlaceOfArrivalAndDispatch(placeOfArrival: String, placeOfDispatch: String){
        println("Flight from $placeOfArrival to $placeOfDispatch:")
        listOfAirlines.forEach{
            if(it.placeOfDispatch == placeOfDispatch && it.placeOfArrival == placeOfArrival) it.printAirline()
        }
    }

    fun findByPlaceOfArrival(placeOfArrival : String){
        println("Airlines with destination - $placeOfArrival:")
        listOfAirlines.forEach{
            if(it.placeOfArrival == placeOfArrival) it.printAirline()
        }
    }

    fun findByDepartureDay(departureDay : String){
        println("Airlines with departure day - $departureDay:")
        listOfAirlines.forEach{
            if(it.departureDays.contains(departureDay)) it.printAirline()
        }
    }

    fun findByDepartureDayAndTime(departureDay: String, time: Double){
        println("Flights on $departureDay with departure time more than $time hours: ")
        listOfAirlines.forEach{
            if(it.departureDays.contains(departureDay) && it.departureTime > time) it.printAirline()
        }
    }

    fun groupingByType(){
        println("Small: ")
        listOfAirlines.forEach{
            if(it.planeType == "small") it.printAirline()
        }
        println("Medium: ")
        listOfAirlines.forEach{
            if(it.planeType == "medium") it.printAirline()
        }
        println("Large: ")
        listOfAirlines.forEach{
            if(it.planeType == "large") it.printAirline()
        }
    }

    fun readFile(fileName : String){
        val fileData = File(fileName).readLines()
        var departureDays : MutableList<String>
        fileData.forEach {
            val airlineData = it.split(" ")
            departureDays = mutableListOf()
            for(i in 5 until airlineData.size) departureDays.add(airlineData[i])
            val airline = Airline(
                placeOfArrival = airlineData[0],
                placeOfDispatch = airlineData[1],
                flightNumber = airlineData[2].toInt(),
                planeType = airlineData[3],
                departureTime = airlineData[4].toDouble(),
                departureDays = departureDays)
            addAirline(airline)
        }
    }

}