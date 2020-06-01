package com.example.kotlinsamples.KotlinExamples

import java.util.*

fun main(args: Array<String>){

    var num = arrayOf(1,'2',"3",4.0,5) // creating diverse array
    println(num.contentToString())

    var numArray = intArrayOf(1,2,3,4,5) // int array
    val numOfEven = numArray.count {it % 2 == 0}
    println("Number of even nums found is: $numOfEven")
    println("Adding the first and second element yeilds: ${numArray[0] + numArray[1]}")

    var quickArray = IntArray(10) { i -> i * 2} // even array
    println(quickArray.contentToString())

    var names = arrayOf("Michael", "Tony", "Elijah", "Joseph", "David","Ryanna") // array of Strings
    names = names.plus("Bob") // adding Bob
    println(names.contentToString())
    var sortedNames = names.sortedArray() //Sorting the names alphabetically
    println("Here is the sorted names array: ${sortedNames.contentToString()}")

    var array2 = arrayOf(intArrayOf(1,2), intArrayOf(3,4), intArrayOf(5,6))
    println(array2.contentDeepToString()) // creates a 3 x 2 array (3 rows 2 columns)

    var array3 = Array(2) {IntArray(5)}
    println(array3.contentDeepToString())



}