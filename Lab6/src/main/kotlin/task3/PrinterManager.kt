package task3

object PrinterManager {
    val printers = mutableListOf<Printer>()
    fun showPrinters(){
        printers.forEach(){
            println("Model ${it.model} Paper: ${it.numberOfSheets} Paint: ${it.percentageOfPaint}")
        }
    }
}