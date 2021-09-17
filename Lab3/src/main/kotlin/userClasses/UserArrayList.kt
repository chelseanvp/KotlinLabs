package userClasses

class UserArrayList (var list: MutableList<String>){

    fun intersectionOfTwoSets(other: UserArrayList) : MutableList<String>{
        val intersectionList = mutableListOf<String>()
        other.list.forEach{
            if(this.list.contains(it)) intersectionList.add(it)
        }
        this.list = intersectionList
        return this.list
    }

    fun isTheCollectionContainAnElement(item : String) =  list.contains(item)


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserArrayList

        if (list != other.list) return false

        return true
    }

    override fun hashCode(): Int {
        return list.hashCode()
    }

    override fun toString(): String {
        return "UserArrayList(list=$list)"
    }

    fun deleteItem(index: Int? = 0) {
        if((index != null) && (index >= 0) && (index <= (list.size - 1))){
            list.removeAt(index)
        }
        else print("Wrong index!")
    }

    fun addItem(element: String) : List<String>{
        list.add(element)
        return list
    }

    fun print(){
        print("List: ")
        list.forEach{print("$it ")}
        println()
    }



}


