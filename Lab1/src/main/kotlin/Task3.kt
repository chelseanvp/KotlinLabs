object Task3 {
    fun repeat(symbol : Char, numberOfTimes : Int?) : String{
        var string = ""
        if(numberOfTimes != null) {
            if (numberOfTimes <= 0) return string
            for (i in 1..numberOfTimes) {
                string += symbol
            }
        }
        return string

    }
}