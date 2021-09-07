import java.lang.IllegalArgumentException
import java.util.*

fun main(args: Array<String>) {
    println("---==TASK 1==---")
    task1(args)
    println("---==TASK 2==---")
    task2()
    println("---==TASK 3==---")
    task3()


 }
fun task1(args: Array<String>){
    if (args.isNotEmpty()){
        println("All element of array equal? -${Task1.isArrayUnique(args)}")
        Task1.findMaxAndMinElementsAndSumAndProduct(args)
        Task1.findTheMostCommonElements(args)
        Task1.sumOfSquaresOfAllNegativeNumbers(args)
    }else {
        println("--Array is empty!--")
    }
}

fun task2(){
    val myArray = mutableListOf(1.0, 2.0, 3.0, 4.0, 5.0)
    println("Array before: $myArray")
    try {
        print("Enter index: ")
        val index: Int? = readLine()?.toInt()
        print("Enter element: ")
        val element: Double? = readLine()?.toDouble()
        try {
            Task2.add(myArray,index,element)
            println("Array after: $myArray")
        }catch (e : IndexOutOfBoundsException ){
            println("--Index out of data!--")
            task2()
        }
    }catch (e : NumberFormatException){
        println("--Please, enter numbers!--")
        task2()
    }
}
fun task3(){
    print("Enter symbol: ")
    val scanner = Scanner(System.`in`)
    try {
        val symbol = scanner.next().single()
        print("Enter number of times: ")
        try {
            val numberOfTimes: Int? = readLine()?.toInt()
            println(Task3.repeat(symbol,numberOfTimes))
        }catch (e : NumberFormatException){
            println("--Please, enter numbers!--")
            task3()
        }
    }catch (e : IllegalArgumentException){
        println("--Enter only single element!--")
        task3()
    }

}