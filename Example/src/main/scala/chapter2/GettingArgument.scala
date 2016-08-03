package main.scala.chapter2

object GettingArgument {
    def main(args: Array[String]): Unit={
        var i = 0
        // How to get args? -> Run Configurations -> 
        // Argument input what you want!
        
        // print args 3 ways compare
        // while loop to print
        while(i < args.length){
            println(args(i))
            i += 1 // i++, i-- not in Scala
        }
        
        // foreach to print
        args.foreach { x => println(x) }
        
        // for loop to print 
        for(x <- args)
            println(x)
    }
}