package main.scala.chapter4

import ChecksumAccumulator.calculate

// Listing 4.4 example
// extends "Application" is abandoned on scala 2.9 version and deleted on 2.11 version
// The App trait is a convenient way of creating an executable scala program. 
object ApplicationTrait extends App{
    for (season <- List("Fall", "Winter", "Spring"))
            println(season +" string convert to ASCII's result : "+ calculate(season))
}