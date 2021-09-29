package task2

class Word (private val language : String, private val value: String ) {
    private val length : Int = value.length

    fun printWordInf(){
        println("Value: $value Length: $length Language: $language")
    }
}