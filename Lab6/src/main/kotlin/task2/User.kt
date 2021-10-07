package task2

class User(val name : String, private var money : Int){
    var accessLevel = 1
    init{
        BookStore.addUser(this)
    }
    fun printUserInfo(){println("Name: $name Money: $money AccessLevel: $accessLevel ")}
    fun updateLevel(){accessLevel++}
    fun downgradeLevel(){accessLevel--}
    fun buyBook(bookName : String) : Boolean{
        if(accessLevel > 1) {
            BookStore.books.forEach {
                if (it.name.lowercase() == bookName) {
                    accessLevel++
                    return spendMoney(it.price)
                }
            }
        }else {
            println("No access!")
            return false
        }
        println("Something went wrong!")
        return false
    }

    private fun spendMoney(price : Int) : Boolean{
        return if(money >= price){
            money -=price
            println("$name spent: $price$. Left: $money$")
            true
        }else{
            println("$name hasn't enough money to pay!")
            false
        }
    }

}