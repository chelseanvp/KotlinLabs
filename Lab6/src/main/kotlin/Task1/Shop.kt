package Task1

import Task1.goods.Guitars
import Task1.goods.Headphones
import Task1.goods.MusicPlayer

abstract class Shop {
    companion object{
        var guitars = mutableMapOf(
            Guitars.ACOUSTIC to 10,
            Guitars.BASS to 12,
            Guitars.CLASSIC to 13,
            Guitars.ELECTRIC to 15
        )
        var headphones = mutableMapOf(
            Headphones.CLOSED_BACK to 50,
            Headphones.EARBUDS to 40,
            Headphones.ON_EAR to 45,
            Headphones.OPEN_BACK to 30
        )
        var musicPlayer = mutableMapOf(
            MusicPlayer.COWON to 9,
            MusicPlayer.ASTELL to 10,
            MusicPlayer.IPOD to 11,
            MusicPlayer.SONY to 15
        )
    }
}