import classes.MyFile

fun task1 (){
    print("Enter file name: ")
    val fileName = readLine()
    if (fileName != null) {
        val task1 = MyFile(fileName = fileName)
        task1.readAndPrintFile()
    }
}