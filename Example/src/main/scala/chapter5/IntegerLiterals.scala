package main.scala.chapter5

object IntegerLiterals {
    def main(args: Array[String]){
        // base 16 (hexadecimal) to decimal
        val hex = 0x5       
        val hex2 = 0x00FF       
        val magic = 0xcafebabe
        println("decimal: " + hex + ", "+ hex2 + ", "+ magic)
        
        // base 8 (octal) to decimal
        // It's cancel the octa shape in the new scala version after 2.10. 
        // you can see issue -> https://issues.scala-lang.org/browse/SI-7618
        val oct = BigInt("35", 8) // using BigInt(string, octal) way
        val nov = BigInt("777", 8)
        println("octal: " + oct + ", "+ nov)
        
        // base 10 (decimal)
        val dec1 = 31
        val dec2 = 255
        println("decimal: " + dec1 + ", "+ dec2)
        
        // Long integer (integer literal ends in an L or l)
        val prog = 0XCAFEBABEL
        val tower = 35L
        val of = 31l
        println("Long integer: " + prog + ", " + tower + ", " + of)
    }
}