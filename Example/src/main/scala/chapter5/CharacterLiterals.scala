package main.scala.chapter5

object CharacterLiterals {
    def main(args: Array[String]){
        val a = 'A'
       
        // The octal number must be between '\0' and '\377'
        val c = '\101'
            
        // a general Unicode character consistng of four hex digits and preceded by \ u
        val d = '\u0041'
        val f = '\u0044'
        println("char: " + a + ", " + c + ", " + d + ", " + f)
        
        // This identifier is treated as identical to BAD
        val B\u0041\u0044 = 1
        println("Bad idead to name: " + B\u0041\u0044)
        
        // speical escape sequence
        val backslash = '\\'
        println("backslash: Char = " + backslash)
        
        
    }
}