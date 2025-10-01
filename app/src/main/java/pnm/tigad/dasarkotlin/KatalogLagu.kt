package pnm.tigad.dasarkotlin

fun main(){
    val brunoSong = KatalogLagu("That What's I Like","Bruno Mars",
        2019,1_000_000)
        brunoSong.printDescription()
        println(brunoSong.isPopular)
}

class KatalogLagu (
    val title :String,
    val artist :String,
    val yearPublished :Int,
    val playCount : Int
){
    val isPopular: Boolean
        get() = playCount >= 1000
    fun printDescription(){
        println("$title, performed by $artist, was released in $yearPublished ")
    }
}