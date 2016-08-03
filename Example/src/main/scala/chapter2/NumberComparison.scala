package main.scala.chapter2

object NumberComparison {
    def main(args: Array[String]): Unit={
        // what's different between max and max2 for code style?
        def max(x: Int, y: Int) = if (x > y) x else y
        println(max(20,10))
        
        def max2(x: Int, y: Int) = if (x > y) println(x) else println(y)
        max2(20,30)
    }
}