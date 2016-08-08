package main.scala.chapter4

//You can define the same name of object and class

object ChecksumAccumulator {
    def main(args: Array[String]){
        val cc = new ChecksumAccumulator
        cc.sum = 3 // sum = 3 
        cc.checksum() // sum = 3
        cc.add(5)  // sum add int = 3 + 5
        cc.checksum() // sum = 8
    }
}

class ChecksumAccumulator{
    private var sum = 0
    def add (i: Int) {sum += i}
    def checksum() {println(sum)}  
}