package main.scala.chapter3

object MapWay {
    def main(args: Array[String]){
        // Immutable way Map(Key, Value)
        val accountInfo = Map(1 -> "Jordan", 2 -> "Fatkai")
        println(accountInfo)
        println(accountInfo(1))       
        // updated some info on accountInfo in immutable way
        val updatedAccountInfo = accountInfo.updated(2, "Webber")
        println(updatedAccountInfo)
        
        // Mutable way
        val mutableAccountInfo = collection.mutable.Map[Int, String]()
        mutableAccountInfo += (1 -> "Jordan")
        mutableAccountInfo(2) = "Fatkai"
        println(mutableAccountInfo)
        println(mutableAccountInfo(2))
        
        // Tuple example and make the conversion to a Seq because 
        // it has sorting methods
        mutableAccountInfo.toSeq.sortBy(_._1).foreach{element => // sort value_1
                val (key, value) = element
                println(key + ": " + value)           
        }            
    }
}