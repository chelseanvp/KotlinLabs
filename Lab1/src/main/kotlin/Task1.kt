import java.lang.NumberFormatException
import kotlin.math.pow

object Task1{
    fun isArrayUnique(args: Array<String>) = args.distinct().size == 1

    fun findMaxAndMinElementsAndSumAndProduct(args: Array<String>){
        try {
            val sortedIntArray = args.map(String::toDouble).sorted()
            println("Min element: ${sortedIntArray[0]}")
            println("Max element: ${sortedIntArray[sortedIntArray.size-1]}")
            println("Sum elements: ${sortedIntArray.sum()}")
            println("Product elements: ${sortedIntArray.reduce { acc, i -> acc * i }}")
        }catch (e: NumberFormatException){
            println("Program found a string argument!")
        }
    }

    fun findTheMostCommonElements(args: Array<String>){
        val uniqueArray = args.distinct()
        var count = 0
        var result: String = ""
        uniqueArray.forEach{ th ->
            if(args.count{it == th} > count){
                count = args.count{it == th}
                result = "$th "
            }else if(args.count{it == th} == count) result += "$th "
        }
        println("The most common elements (count: $count): $result")
    }

    fun sumOfSquaresOfAllNegativeNumbers(args: Array<String>){
        try {
            val uniqueArray = args.map(String::toDouble).distinct()
            var sumOfSquares = 0.0
            uniqueArray.forEach{
                if(it < 0) {
                    sumOfSquares += it.pow(2.0)
                }
            }
            println("Sum of squares of all negative numbers: $sumOfSquares")
        }catch (e: NumberFormatException){
            println("Program found a string argument!")
        }
    }
}

