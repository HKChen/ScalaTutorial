package main.scala.chapter3

object ListWay {
    def main(args: Array[String]){
        val oneTwo = List(1, 2)
        val threeFour = List(3, 4)
        // List has a method named ‘:::’ for list concatenation
        val oneTwoThreeFour = oneTwo ::: threeFour 
        println(oneTwoThreeFour)
        oneTwoThreeFour.mkString(",").foreach { print }
        println
        
        // Perhaps the most common operator you’ll use with lists is 
        // ‘::’, which is pronounced “cons.”
        // Given that a shorthand way to specify an empty list is Nil, 
        // one way to initialize new lists is to string together elements 
        // with the cons operator, with Nil as the last element
        val oneTwoThree = 1 :: 2 :: 3 :: Nil
        println(oneTwoThree)
        println(4 :: oneTwoThree)    // compare with next line
        println(oneTwoThree. :: (4))
        
        val remixLink = 1 :: 2 :: threeFour
        println(remixLink)
        
        // you can link List and Array
        val list1 = List(1, 2, 3)
        val arr1 = Array(4, 5, 6)
        (list1 ++ arr1).mkString(",").foreach { print }
        // remember array not ':::' method, you can't list ::: array
        println
        
        val list2 = List(1, 2, 4, 5)
        def remove(num: Int, list: List[Int]) = list diff List(num)
        println(remove(2, list2)) // remove the element int 2 from list2    
    }
}