package main.scala.chapter3

object TuplesWay {
    def main(args: Array[String]){
        val tuple = (17, "Fatkai", true) // if you put this value in List
                                         // List will change to Scala.Any
                                         // you need to remember what type
                                         // you put in List
        println(tuple._1)        // 17
        println(tuple._2)        // Fatkai
        println(tuple._3)        // true
        println(tuple.getClass)  // class scala.Tuple3 <- 3 element
        
        // So, tuple's cons is a good way for modify more val and type
        val (id, name) = (123, "Fatkai")
        println(id)
        println(name)
        
        // function example
        def account(id: Int, name: String){
            println(id, name)
        }
        account(123,"Fatkai")
    }
}