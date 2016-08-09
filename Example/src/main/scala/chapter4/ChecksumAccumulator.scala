package main.scala.chapter4

//You can define the same name of object and class
import scala.collection.mutable.Map
import com.sun.javafx.css.CalculatedValue

object ChecksumAccumulator {
    // Singleton object
    private val cache = Map[String, Int]()
    def calculate(s: String): Int=
        if (cache.contains(s))
            cache(s)
        else{
            // String convert to ASCII
            val acc = new ChecksumAccumulator
            for(c <- s)
                acc.add(c.toInt)
            val cs = acc.checksum()
            cache += (s -> cs)
            cs
        }
        
    def main(args: Array[String]){
        val cc = new ChecksumAccumulator
        cc.sum = 3 // sum = 3 
        println("Result: " + cc.checksum()) // sum = 3
        cc.add(5)  // sum add int = 3 + 5
        println("Result: " + cc.checksum()) // sum = 8
        
        // Singleton object invoke
        ChecksumAccumulator.calculate("Every value is an object")
        // A's ASCII is 65
        println("String Convert to ASCII's Result : "+ calculate("A"))
    }
}

class ChecksumAccumulator{
    private var sum = 0
    def add (i: Int) {sum += i}
    def checksum(): Int = sum
}