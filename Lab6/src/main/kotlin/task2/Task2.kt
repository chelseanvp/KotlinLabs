package task2

fun task2(){
    val admin = Admin("Nikolay")
    val user = User("Kiril",200)
    val user2 = User("Ivan",300)
    println("All books: ${BookStore.books}")
    admin.printAllUsers()
    admin.removeUserById(2)
    user.buyBook("horror")
    admin.upgradeLevel(1)
    admin.printAllUsers()
    user.buyBook("horror")
    user.printUserInfo()
}

