package main.scala.chapter1

object Country2City {
    def main(args: Array[String]): Unit={
        // It's mutable (var) 
        var capital_1 = Map("US" -> "Washington", "France" -> "Paris")
        capital_1 += ("Taiwan" -> "Taipei") // mutable way
        println(capital_1)
        println(capital_1("France"))
        
        
        // It's immutable (val) 
        val capital_2 = Map("US" -> "Washington", "France" -> "Paris")
        println(capital_2 + ("Taiwan" -> "Taipei")) // immutable way
        println(capital_2("France"))
    }
}