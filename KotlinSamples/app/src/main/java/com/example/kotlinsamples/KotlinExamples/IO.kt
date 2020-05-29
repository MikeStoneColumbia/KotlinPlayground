package com.example.kotlinsamples.KotlinExamples

import kotlin.reflect.typeOf

fun main(args:Array<String>){

    println("What is your name?")
    val name = readLine()
    println("How old are you?")
    var age : Int = Integer.valueOf(readLine().toString())
    println("Hello there ${name}, I see that you are ${age} years old")

}