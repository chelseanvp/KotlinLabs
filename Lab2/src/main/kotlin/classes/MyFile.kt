package classes

import java.io.BufferedReader
import java.io.File

class MyFile (private var fileName: String = "") {
    init {
        fileName += ".txt"
    }

    private fun isFileExist(fileName: String): Boolean {
        return File(fileName).isFile
    }

    private fun addTxt(fileName: String): String {
        return "$fileName.txt"
    }

    private fun readFileToString(fileName: String): String {
        val bufferedReader: BufferedReader = File(fileName).bufferedReader()
        return bufferedReader.use { it.readText() }
    }

    private fun writeFile(fileName: String, data : String) = File(fileName).writeText(data)

    fun readAndPrintFile() {
        if (isFileExist(fileName)) {
            println("File was found!")
            val fileData = readFileToString(fileName)

            val listOfFileData = fileData.filterNot { it == "."[0] }.split(" ")
            val mutableMapWithSubStrings: MutableMap<String, Int> = mutableMapOf()

            for (string in listOfFileData) {
                if (!mutableMapWithSubStrings.contains(string.lowercase())) {
                    mutableMapWithSubStrings[string.lowercase()] = 1
                } else {
                    mutableMapWithSubStrings.merge(string.lowercase(), 1, Int::plus)
                }
            }

            val sortedMap = mutableMapWithSubStrings.toList().sortedBy { (k, v) -> v }.toMap()
            for (elem in sortedMap) {
                println(elem)
            }
        } else {
            println("Can't find file")
        }
    }

    fun joinTwoFiles(file1: String, file2: String, file3: String) {
        if (!(isFileExist(addTxt(file1)) && isFileExist(addTxt(file2)))) {
            println("File1 or File2 not found!")
        } else {
            val listOfFile1 = readFileToString(addTxt(file1)).split("\n")
            val listOfFile2 = readFileToString(addTxt(file2)).split("\n")
            var str = ""
            try {
                for (el1 in listOfFile1) {
                    for (el2 in listOfFile2) {
                        if (el1[0] == el2[0]) {
                            str += "${el1[0]}${el1.drop(1)}${el2.drop(1)}\n"
                        }
                    }
                }
                writeFile(file3,str)
            }catch (e : StringIndexOutOfBoundsException){
                println("-Wrong file format-")
            }
        }
    }

    fun joinTwoFiles(key1Number: Int, key2Number : Int, file1: String, file2: String, file3: String) {
        if (!(isFileExist(addTxt(file1)) && isFileExist(addTxt(file2)))) {
            println("File1 or File2 not found!")
        }else{
            val listOfFile1 = readFileToString(addTxt(file1)).split("\n")
            val listOfFile2 = readFileToString(addTxt(file2)).split("\n")

            var str = ""
            for(el1 in listOfFile1){
                val substrings1 = el1.split(" ")
                for(el2 in listOfFile2){
                    val substrings2 = el2.split(" ")
                    if(substrings1[key1Number-1] == substrings2[key2Number-1]){
                        str += "${substrings1[key1Number-1]} " +
                                    "${el1.replace(substrings1[key1Number-1],"")} " +
                                    "${el2.replace(substrings2[key2Number-1],"")}\n"
                    }
                }
            }
            println(str)
            writeFile(file3,str)
        }
    }
}

//join -1 2 -2 2 file1 file2 file3