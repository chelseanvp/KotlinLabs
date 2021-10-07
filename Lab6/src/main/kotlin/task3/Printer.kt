package task3

class Printer(val model : String, private val chanceOfJamming : Int) {
    private var isPrinterJammedPaper = false
    private var queueOfSheets = 0
        set(value) { field = if(value >= 0) value else field }
    var numberOfSheets = 0
    var percentageOfPaint = 0.0f
        set(value) { field = if(value in 0.0..100.0) value else field }
    fun start(){
        var power = true
        while (power) {
            standbyMode()
            try {
                print("Enter: ")
                when(readLine()?.toInt()){
                    1 -> power = powerOff()
                    2 -> printing()
                    3 -> loadPaper()
                    4 -> removeJammedPaper()
                    5 -> addPaint()
                }
            }catch (e : NumberFormatException){
                println("Invalid input, try again!")
            }
        }
    }
    private fun removeJammedPaper(){if (isPrinterJammedPaper) isPrinterJammedPaper = false else println("All good!")}
    private fun powerOff() : Boolean{
        println("Printer is off!")
        return false
    }
    private fun printing(){
        var count = 1
        try {
            print("Enter number of sheets: ")
            var numberOfSheets = readLine()?.toInt()
            if (numberOfSheets != null) {
                numberOfSheets += queueOfSheets
                if(isPrinterJammedPaper) println("Remove jammed paper!")
                while(this.numberOfSheets != 0 && numberOfSheets > 0 && !isPrinterJammedPaper && percentageOfPaint>0.0f){
                    if((0..100).random() in 0 until chanceOfJamming){
                        isPrinterJammedPaper = true
                        this.numberOfSheets--
                        queueOfSheets += numberOfSheets
                        println("Error! Paper is damaged!")
                    }else {
                        println("Sheet $count has been printed!")
                        count++
                        numberOfSheets--
                        this.numberOfSheets--
                        queueOfSheets--
                        percentageOfPaint -= 0.1f
                    }
                }
                if(percentageOfPaint <= 0.0f){ println("The paint is over!")}
                if(this.numberOfSheets == 0) println("All paper is out!")
                queueOfSheets = numberOfSheets
            }
        }catch (e : NumberFormatException){
            println("Invalid input!")
        }
    }
    private fun addPaint(){
        print("Enter value: ")
        percentageOfPaint = readLine()?.toFloat()?.plus(percentageOfPaint) ?: percentageOfPaint }
    private fun loadPaper(){
        print("Enter number of sheets: ")
        try {
            val paperCount = readLine()?.toInt()
            if(paperCount != null && paperCount >=0){
                numberOfSheets += paperCount
                println("Paper added!")
            }
        }catch (e : NumberFormatException){
            println("Invalid input!")
            loadPaper()
        }
    }
    private fun standbyMode(){
        println("Printer ($model) status: Sheets: $numberOfSheets Paint: $percentageOfPaint.% Queue: $queueOfSheets")
        println("Waiting..")
        printerMenu()
    }
    private fun printerMenu(){
        println("1-Power off")
        println("2-Printing")
        println("3-Load paper")
        println("4-Removing jammed paper")
        println("5-Cartridge refilling")
    }
}