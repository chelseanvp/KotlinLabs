package task2

class Page (private val number: Int, private val word: Word) {

    fun display(){
        print("Page ($number) contain: ")
        word.printWordInf()
    }

}