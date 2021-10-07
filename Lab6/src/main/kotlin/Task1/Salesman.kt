package Task1

import Task1.goods.Guitars
import Task1.goods.Headphones
import Task1.goods.MusicPlayer

class Salesman(private val name: String) : Shop() {

    fun service(customers: List<Customer>,whatProduct: List<String>,personalProductName: List<String>){
        for (i in customers.indices){
            service(customers[i], whatProduct[i], personalProductName[i])
        }
    }

    fun service(customer: Customer, whatProduct : String, personalProductName : String){
        when(whatProduct){
            "guitar" -> sellGuitar(customer, personalProductName)
            "headphones" -> sellHeadphones(customer, personalProductName)
            "music player" -> sellMusicPlayer(customer, personalProductName)
            else -> println("Product not found!")
        }
    }
    private fun sellGuitar(customer: Customer, personalProductName : String) : Boolean{
        Guitars.values().forEach {
            if(it.name.lowercase() == personalProductName && guitars.containsKey(it) && guitars[it]!! >=1){
                if(customer.spendMoney(it.price)) {
                    guitars[it] = guitars.getValue(it).minus(1)
                    println("$name sold ${it.name.lowercase()} guitar")
                    return true
                }
            }
        }
        println("Something went wrong")
        return false
    }
    private fun sellHeadphones(customer: Customer,personalProductName : String) : Boolean{
        Headphones.values().forEach {
            if(it.name.lowercase() == personalProductName && headphones.containsKey(it) && headphones[it]!! >=1){
                if(customer.spendMoney(it.price)) {
                    headphones[it] = headphones.getValue(it).minus(1)
                    println("$name sold headphones: ${it.name.lowercase()}")
                    return true
                }
            }
        }
        println("Something went wrong")
        return false
    }
    private fun sellMusicPlayer(customer: Customer,personalProductName : String) : Boolean{
        MusicPlayer.values().forEach {
            if(it.name.lowercase() == personalProductName && musicPlayer.containsKey(it) && musicPlayer[it]!! >=1){
                if(customer.spendMoney(it.price)) {
                    musicPlayer[it] = musicPlayer.getValue(it).minus(1)
                    println("$name sold music player: ${it.name.lowercase()}")
                    return true
                }
            }
        }
        println("Something went wrong")
        return false
    }
}