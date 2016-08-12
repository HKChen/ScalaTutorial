package main.scala.chapter5

object StringLiterals {
    def main(args: Array[String]){
        val hello = "hello"
        val escapes = "\\\"'"
        println(hello + ", " + escapes)
        
        // compare with two print method
        println("""Welcome to Ultamix 3000.
                   Type "HELP" for help.""")
        println("""|Welcome to Ultamix 3000.
                   |Type "HELP" for help.""".stripMargin)        
    }
}