package main.scala.chapter1

object NameHasUpperCase {
    def main(args: Array[String]): Unit={
        // val name: String
        val name = "hkchen"
        
        // val boolean
        val nameHasUpperCase1 = name.exists(_.isUpper)
        // to show nameHasUpperCase1 is UpperCase or not
        println("nameHasUpperCase1")
        
        // def boolean function
        def nameHasUpperCase2 = println(name.exists(_.isUpper))
        // to show nameHasUpperCase2 is UpperCase or not
        nameHasUpperCase2
    }
}