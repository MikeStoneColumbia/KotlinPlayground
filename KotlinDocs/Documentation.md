# Simple documentation of Kotlin rules and syntax





## Variables

We can create variables in Kotlin by using the __var__ or __val__ keywords. Simply say _var nameOfVar : valueDesired_ and the same thought applies to __val__. 
One such example is _var name : "Bob"_. Here we created a variable called name that stores the String Bob. Now there are some differences between _val_ and _var_.
_var_ is mutable while _val_ is not. This means that _var_ can be reassigned multiple times while _val_ is static/constant and can only be assigned once.
__val__ is equivalent to the __final__ keyword in java. To declare numbers there is a small extra step. You need to specify what kind of number (int, double, short, etc..).
Refer to the __Numbers__ section in the Data Type tab for examples or look in the DataTypes.kt file. For the time being you can just assume __var num = 9__ is the way to delcare nums

## Data Types

### Numbers

The following are an example of the kind of numbers we can use in Koltin. This is very similar to java with regard to types and number of bits used.
As mentioned in the __Variables__ section declaring what type of num you want has an extra step. If you want to delcare say a new Double then you would need to specify it as follows
__var example: Double = 2.0__. (Note if you are using float be sure to add the 'f' at the end. _var example: Float = 100.0f_)

    1. byte 8 bits
    1. short 16 bits
    1. int 32 bits
    1. float 32 bits
    1. long 64 bits
    1. double 64 bits

__Note: In Java there are ints and Integers. In koltin there is no such differentiation. Simply use the Int. Also in Java converting a small data type to a larger one such as int --> to double is possible;
in Kotlin it isn't possible.__

### Char

The char variable type can only take in one character. It is represented using __''__. For example, __val initial : Char = 'a'__ 

### Boolean

Can only represen __true__ or __false__. Example, var bool: Boolean = true

## Operations

All the typical mathematical operations are present in Kotlin. One small thing to note. * can be used for multipication and to represent multiple multiple arguments.
Logical and bitwise operations are the same as in Java __ && || ! ==_ Also using augmented operators such as _ += and /=_ also have same implementation as Java. > < >= <= are also used in Kotlin.

### Arrays

To create an array you must use the ArrayOf() call. One such example is __var numArray = arrayOf(1,2,3,4,5)__. You can also specify a certain type of array as such __var numArray = intArrayOf(1,2,3,4,5)__
Now it should be noted that both examples would yeild an int array. The big difference isi that arrayOf() can take in different data types, while intArrayOf() only takes in ints. So
_var numArray = arrayOf(1, '2', "3", 4.0, 5)_ would be valid despirt haveing int, double, char and string vals. If we use intArrayOf() then we would only be able to use ints.

Another cool trick worth mentioning is that you can create an Array that already has precreated vals based on some rule or pattern. For example lets say we want to make an array that initially has
the first 10 even numbers. You could do the following __var evenArr = IntArray(10){i -> i * 2}__. This takes advantage of the Lambda statements.

Setting and retriving values in an array is also rather simple. if we have an array names. To get the first element we just use __names[0]__. If we want to change the first name we can use __names[0] = "bob"_
arrays can also use the __set()__ and __get()__ methods as well. In Java set() and get() are typically used by ArrayList but in Kotlin they can be used by arrays as well. So using the previous example
we can say __names.get(0)__ to get the first name and __names.set(0,"bob")__ to change the first name. We can also use methods such as _indexOf(), first(), last()_ to get the value at a certain index,
first element of the array, and the last element.

Arrays in Kotlin like Java are immutable in terms of their size. If you have a list of num and it contains [1,2,3] then we can't modify the array to become [1,2,3,4] (_i.e can't say num[3] = 4_). However,
if we use the __plus()__ method we can get around it. _plus_ allows us to append to an array. It creates a new array that is larger in size and then copies over existing values, and then appends the new
info. Example: __var names = arrayOf(1,2,3,4)__ we can exapnd it by __names = names.plus(5)__. This will return an array of __[1,2,3,4,5]__

There are numerous ways to create a 2D array in Kotlin. One way is to make use of the lambda expressions as such __var array2D = Array(2) {IntArray(10)}__ This creates an array with 2 rows and 10 columns.
Another method uses the _arrayOf()_ method and can be useful if you want to initizalize default values besides 0. __var array2D = arrayOf(IntArray(1,2),IntArray(3,4),IntArray(5,6))__. Thus creates a 2D
array with 3 rows and 2 columns

### Elvis Operator

_Too be filled in soon_

### Assertion

_To be filled in soon_

### Indexed Accessed Operator

_To be filled in soon_

### Safe call

_To be filled in soon_

## I/O

readLine() is an example of an Input command. It can take nums and Strings as input (Similar to _Scanner_ in Java). If you want to cast to Int must use __Integer.valueOf(readLine().toString())__.
Example: __var age : Int = Integer.valueOf(readLine())__. Also if you are explitly storing a String, __var name : String = readline().toString()__. Note: _var name = readLine()_ would also work for storing
some String.

## Functions

Always start off by using the key word __fun__ followed by the name of your function, and then any parameters. One main difference between Kotlin and Java is where we specify the return type.
In Java it is common to see something like _public static int sum(int a, int b)_. The Kotlin equivalent is _fun sum(a: Int, b: Int) Int_. We specify the return type after the paramters but before the 
brackets.

One other small change is we can inline one-liner functions. Sum for example is only a + b. We can simplify that by creating: __fun sum(a: Int, b: Int) Int = a+b__. This way we avoid having to type out
__return__ and the curly brackets.

One very useful tool is the __vararg__ type. Vararg allows a function to take variable nums of paramters. Usually functions are constrainted to taking in a certain fixed number of paramters; for example
like sum. It can ever only take in 2 paramters based on how it was implemented. varargs allows to use as many or as little parameters as we we would like. Check the __Functions__ file for an example.

## Classes

Similar to java, Kotlin classes use the __class__ to delcare the creation of a new class. The format is usually _class NameOfClass {/* code class goes here */}_
To use that class to create objects use then follow the same procedure as making a variable. It should look something like this __var nameOfObj : Object()__ where Object() is the class you want to make 
an instance of.

