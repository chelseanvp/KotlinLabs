package task2

object BookStore {
    val books = mutableListOf(*Books.values())
    private val usersList = mutableMapOf<Int,User>()
    private var userCounter : Int = 0
    fun addUser(user: User){
        userCounter++
        usersList[userCounter] = user
    }
    fun removeUserById(id : Int){ usersList.remove(id)}
    fun findUserById(id : Int): User? {
        if(usersList.containsKey(id)) return usersList[id]
        else println("User not found!")
            return null
    }
    fun printAllUsers(){
        usersList.forEach{
            println("Id: ${it.key}. Name: ${it.value.name}. Access level: ${it.value.accessLevel}.")
        }
    }


    fun menu(key : Int){
        print("All available books: ")
        println(books)
        if(key > 1){

        }

    }
}