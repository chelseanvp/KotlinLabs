package task2
import classes.MyFile

fun task2(){
    print("---Task2--- \nEnter arguments: ")
    val arguments = readLine()?.split(" ")?.toTypedArray()
    if(arguments != null && arguments[0] == "join") {
        val task2 = MyFile()
        try {
            when(arguments.size){
                4 -> task2.joinTwoFiles(file1 = arguments[1],file2 = arguments[2],file3 = arguments[3])
                8 -> task2.joinTwoFiles(
                    key1Number = arguments[2].toInt(),
                    key2Number = arguments[4].toInt(),
                    file1 = arguments[5],
                    file2 = arguments[6],
                    file3 = arguments[7]
                )
            }
        }catch (e : Exception) {
            println("Wrong arguments")
        }
    }else{
        println("Empty arguments!")

    }

}


