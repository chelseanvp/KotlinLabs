package task2

fun task2(){
    val learnerList = mutableListOf<Learner>()
    val schoolboy1 = Schoolboy("Kolya",15,8)
    val student1 = Student("Anton",19,2)
    val schoolboy2 = Schoolboy("Zhenya",14,7)
    learnerList.add(schoolboy1)
    learnerList.add(student1)
    learnerList.add(schoolboy2)
    learnerList.forEach{
        if(it is Schoolboy){
            it.printName()
            it.printAge()
        }
    }
    learnerList.forEach{
        if(it is Student) {
            it.printName()
            it.printAge()
        }
    }
}