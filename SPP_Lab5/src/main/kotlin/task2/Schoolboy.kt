package task2

class Schoolboy (override val name: String, override var age: Int, var classNumber : Int) : Learner {

    fun raiseClass() {if(classNumber in 1..10) classNumber++}
    override fun printName() {
        print("Schoolboy Name: $name")
    }
    override fun printAge() {
        println(" Age: $age")
    }

}