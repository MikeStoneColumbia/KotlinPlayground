package com.example.kotlinsamples.KotlinExamples

fun main(args: Array<String>){

    println("${sum(1,2)}")
    println("${sumV2(1,1)}")
    var new: Unit = sumV3(5,5)
    println("${getAvg(20,40)}")
}

fun sum(a : Int, b: Int): Int{

    return a + b;

}

fun sumV2(a: Int, b : Int) :Int = a+b // does the same thing as sum

fun sumV3(a: Int, b: Int){

    println(a + b)
}

fun getAvg(vararg input: Int): Int{

    var sum = 0
    input.forEach { n -> sum += n }

    return sum/input.size

}
