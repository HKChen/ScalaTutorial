package main.scala.chapter5

object FloatLiterals {
    def main(args: Array[String]){
        // double
        val big = 1.2345
        val bigger = 1.2345e1
        val biggerStill = 123E45
        val anotherDouble = 3e5
        val yetAnother = 3e5D
        println("double: " + big + ", " + bigger + ", " + biggerStill 
                + ", " + anotherDouble + ", " + yetAnother )
        
        // float (a floating-point literal ends in an F or f)
        val little = 1.2345F
        val littler = 3e5f
        println("float: " + little + ", " + littler)
    }
}