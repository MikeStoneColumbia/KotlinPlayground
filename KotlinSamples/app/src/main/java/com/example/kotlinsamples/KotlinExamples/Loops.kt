package com.example.kotlinsamples.KotlinExamples

import java.util.*

fun main(args: Array<String>){

    for( i in 1..10)
        println(i)

    var i = 0
    while(i<10){
        println(i++)
    }

    var x = 10
    do{
        println("current val of x is $x")
        x--
    }while(x>0)

    when(x){

       in 1..10 -> println("$x is in the range 1 to 10")
       else -> println("$x is outside the specified range")

    }
    when{
        x % 2 == 0 -> println("$x is even")
        else -> println("$x must be odd")
    }

}