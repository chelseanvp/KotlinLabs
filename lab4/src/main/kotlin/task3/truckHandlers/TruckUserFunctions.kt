package task3.truckHandlers
import task3.Dispatcher
import java.time.LocalDate
import java.time.format.DateTimeParseException

fun actionsWithTrucks(){
    Dispatcher.AutoBase
    do {
        printTruckMenu()
        when (readLine()) {
            "1" -> addTruck()
            "2" -> findTruckBySerialNumber()
            "3" -> Dispatcher().printAllTrucks()
            "4" -> Dispatcher().saveTruckToFile()
            "5" -> changeServiceableStatus()
            "0" -> break
            else -> println("Wrong input!")
        }
    }while (true)
}
fun printTruckMenu(){
    println("#1 Add truck")
    println("#2 Find truck by serial number")
    println("#3 Print all trucks")
    println("#4 Save trucks")
    println("#5 Change serviceable status")
    println("#0 Exit")
    print("Enter operation number: ")
}
fun changeServiceableStatus(){
    print("Enter serial number: ")
    val serialNumber = readLine()?.toInt()
    if (serialNumber != null) {
        Dispatcher().changeServiceableStatus(serialNumber)
    }
}
fun addTruck(){
    val dispatcher = Dispatcher.AutoBase
    print("serialNumber: ")
    val serialNumber = readLine()?.toInt()
    print("manufacturer: ")
    val manufacturer = readLine()
    print("Model: ")
    val model = readLine()
    print("Engine: ")
    val engine = readLine()
    print("Release date: ")
    val releaseDate = readLine()
    if(serialNumber != null && manufacturer != null && model != null && engine != null && releaseDate != null)
        try {
            dispatcher.addTruck(serialNumber, manufacturer, model, engine, LocalDate.parse(releaseDate))
        }catch (e : DateTimeParseException){
            println("Wrong date format!")}
    else println("Wrong input!")

}
fun findTruckBySerialNumber(){
    print("Enter serial number: ")
    val serialNumber = readLine()?.toInt()
    if (serialNumber != null) Dispatcher().findTruckBySerialNumber(serialNumber)
}