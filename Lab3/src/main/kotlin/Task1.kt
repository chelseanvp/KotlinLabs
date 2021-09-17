import userClasses.UserArrayList
import java.lang.NumberFormatException

fun task1() {
    val list1 = mutableListOf("1","2","3","5","7")
    val list2 = mutableListOf("2","3","4","5")
    val arrayList1 = UserArrayList(list1)
    val arrayList2 = UserArrayList(list2)
    println("Intersection of two sets: " + arrayList1.intersectionOfTwoSets(arrayList2))
    print("| Enter item: ")
    var item = readLine()
    println("Does value ($item) belongs to set? : " + item?.let { arrayList1.isTheCollectionContainAnElement(it) })
    arrayList1.print()
    print("| Enter index to delete item: ")
    try {
        val index = readLine()?.toInt()
        arrayList1.deleteItem(index)
        arrayList1.print()
    }catch (e : NumberFormatException) {
        println("Wrong number format! Program used the default value.")
        arrayList1.deleteItem()
        arrayList1.print()
    }
    print("Enter item to add to the end of the list: ")
    item = readLine()
    item?.let { arrayList1.addItem(it) }
    arrayList1.print()
    if(arrayList1.equals(arrayList2)){
        println("Arrays (${arrayList1.list} ${arrayList2.list}) are equals")
    }else{
        println("Arrays (${arrayList1.list} ${arrayList2.list}) not equals")
    }

}
