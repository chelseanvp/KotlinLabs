object Task2 {
    fun add(array: MutableList<Double>, index: Int?, element: Double?){
        if (index != null && element != null) {
                array.add(index, element)
        }
    }

}