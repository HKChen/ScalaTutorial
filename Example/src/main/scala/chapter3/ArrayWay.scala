package main.scala.chapter3

object ArrayWay {
    def main(args: Array[String]){
        val greetStrings = new Array[String](3)
        greetStrings(0) = "Hello"  // invoke update() way
        greetStrings(1) = ", "
        greetStrings(2) = "Scala!\n"
        for(c <- 0 to 2)
            print(greetStrings(c)) // invoke apply() way
        
        greetStrings.foreach { x => print(x) }
                
        val comparisonStrings = new Array[String](3)
        comparisonStrings.update(0, "Hello") // comparisonStrings(1)=" "
        comparisonStrings.update(1, ", ")
        comparisonStrings.update(2, "Scala!\n")
        for(c <- 0 to 2)
            print(comparisonStrings.apply(c)) // comparsionStrings(c)
        
        comparisonStrings.foreach { x => print(x) }
        
        // length to print
        val arr = Array("Hello", ", ", "Scala!\n")
        for(c <- 0 until arr.length)
            print(arr(c))
        for(c <- arr)
            print(c)   
        arr.foreach { x => print(x) }
        arr.foreach { print }
        
        // filter
        val arrNum = Array(10, 20, 30 ,40 ,50)
        arrNum.filter { x => x > 30 }.foreach { println }
        arrNum.filter { _ > 30 }.foreach { println }
        // map
        arrNum.map { x => x + 1 }.foreach { println }
        arrNum.map { _ + 1 }.foreach { println }
                
        // link array
        val arr1 = Array(10, 20, 30)
        val arr2 = Array(40, 50, 60)
        (arr1 ++ arr2).foreach { println} // using ++ not +
                
        // compare value
        val arr3 = Array(10, 20, 30)
        val arr4 = Array(10, 20, 30)  
        println(arr3 == arr4) // false
        println(arr3.deep == arr4.deep) // true (deepEquals can't use)
        
    }
}