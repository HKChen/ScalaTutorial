package main.scala.chapter3

object SetWay {
    def main(args: Array[String]){
        // immutable way to add 
        // Set default is immnutable that is define on scala.Predef
        val city = Set("Taipei", "NY", "Tokiyo") 
        val city1 = city + "Paris"
        println(city + "Bcn")
        println(city1)

        // mutable way to add
        val country = scala.collection.mutable.Set("TW", "USA", "JP")
        country += "ESP"
        println(country)
    }
}