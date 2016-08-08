package main.scala.chapter3

object GettingFile {
    def main(args: Array[String]){
        // Read line from file via scala
        // If you want to write on file, you need to import java.io method
        val fileName = "/Users/HK/ScalaTutorial/Example/src/main/scala/chapter3/GettingFile.scala"
        try{
            for(line <- scala.io.Source.fromFile(fileName).getLines())
                println(line)
        }catch{
            case ex: Exception => println("Path: " + ex + "not right.")
        }
        
        
        // Read line from file via import java.io
        try{
            val f = new java.io.FileReader("/Users/HK/ScalaTutorial/Example/src/main/scala/chapter3/GettingFile.scala")
            val reader = new java.io.BufferedReader(f)
            // using Iterator or Stream
            val strs = Stream.continually(reader.readLine()).takeWhile(_ != null).mkString("\n")
            println(strs)              
        }catch{
            case ex: java.io.FileNotFoundException => println("file path may error")
            case ex: java.io.IOException => println("IO Exception")
        }      
    }
}