package Task1

class Customer(private var money : Int, private val name : String, private val surname : String ) {
    fun spendMoney(price : Int) : Boolean{
        return if(money >= price){
            money -=price
            println("$name $surname spent: $price$. Left: $money$")
            true
        }else{
            println("$name hasn't enough money to pay!")
            false
        }
    }
}