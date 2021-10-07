package task1

class Theatre : PublicBuilding(3) {
    override var numberOfFloors: Int = 0
        get() = super.numberOfFloors
        set(value) {field = value.plus(12)}

    fun printInf(){
        println("Number of floors: $numberOfFloors")
    }
}