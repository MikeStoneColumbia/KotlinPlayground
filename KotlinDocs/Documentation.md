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

### Elvis Operator

_Too be filled in soon_

### Assertion

_To be filled in soon_

### Indexed Accessed Operator

_To be filled in soon_

### Safe call

_To be filled in soon_

## Classes

Similar to java, Kotlin classes use the __class__ to delcare the creation of a new class. The format is usually _class NameOfClass {/* code class goes here */}_
To use that class to create objects use then follow the same procedure as making a variable. It should look something like this __var nameOfObj : Object()__ where Object() is the class you want to make 
an instance of.

