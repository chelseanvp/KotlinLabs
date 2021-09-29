package task1

class Mobile(val number: Int, val name: String, val weight: Double){

    inner class MobileManager{
        fun printMobile(){
            println("Name: $name Number: $number Weight: $weight")
        }
    }
}