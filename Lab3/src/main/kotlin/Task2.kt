import userClasses.AirlinesManager

fun task2(){
    AirlinesManager.readFile("Airlines")
    AirlinesManager.printAirlines()
    AirlinesManager.findByPlaceOfArrival("Brest")
    AirlinesManager.findByDepartureDay("Sunday")
    AirlinesManager.findByDepartureDayAndTime("Monday",13.00)
    AirlinesManager.groupingByType()
    AirlinesManager.findByPlaceOfArrivalAndDispatch("Minsk","Brest")
}
