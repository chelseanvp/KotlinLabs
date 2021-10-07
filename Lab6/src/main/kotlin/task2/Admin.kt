package task2

class Admin(name : String) {
    fun upgradeLevel(id : Int){if(BookStore.findUserById(id) != null) BookStore.findUserById(id)?.updateLevel()}
    fun downgradeAccessLevel(id : Int){if(BookStore.findUserById(id)!=null)BookStore.findUserById(id)?.downgradeLevel()}
    fun removeUserById(id : Int){ if(BookStore.findUserById(id) != null) BookStore.removeUserById(id)
        else println("User not found!")}
    fun printAllUsers(){
        println("All users: ")
        BookStore.printAllUsers()
    }

}