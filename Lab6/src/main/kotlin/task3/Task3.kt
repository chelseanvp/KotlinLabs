package task3

fun task3(){
    val printer1 = Printer("Canon-MF4450",1)
    val printer2 = Printer("Samsung-IM2",2)
    PrinterManager.showPrinters()
    printer1.start()
}