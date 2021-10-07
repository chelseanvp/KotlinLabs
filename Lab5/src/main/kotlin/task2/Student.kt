package task2

class Student (override val name: String, override val age: Int, var courseNumber : Int) : Learner{
    fun raiseCourse() {if(courseNumber in 1..4) courseNumber++}
    override fun printName() {
        print("Student Name: $name")
    }
    override fun printAge() {
        println(" Age: $age")
    }

}