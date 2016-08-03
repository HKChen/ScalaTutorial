package main.scala.chapter1

object Factorial {
    def main(args: Array[String]): Unit={
        def factorial(x: BigInt): BigInt = 
            if (x == 0) 1 else x * factorial(x - 1)
        
        println(factorial(30))
    }
}