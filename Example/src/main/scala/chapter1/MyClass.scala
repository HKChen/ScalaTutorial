package main.scala.chapter1

object MyClass {
    def main(args: Array[String]): Unit={
        // invoke MyClass
        val account = new MyClass(1, "Fatkai")      
    }
}

class MyClass(index: Int, name: String){
    println(index, name)
}