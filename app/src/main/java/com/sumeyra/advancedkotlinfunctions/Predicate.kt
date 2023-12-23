package com.sumeyra.advancedkotlinfunctions

fun main(){

    val evenNumberList = listOf<Int>(0,2,4,6,8,10)

    val allCheck = evenNumberList.all {
        it>6 // all of them are bigger than 6 : false
    }
    println(allCheck)

    val anyCheck = evenNumberList.any{
        it <2 // any of them is smaller than 2
    }
    println(anyCheck)

    val totalCount = evenNumberList.count {
        it >0 // how many numbers are bigger than zero
    }
    println(totalCount)


    val findNum = evenNumberList.find {
        it >4 // find first number that is bigger than four
    }
    println(findNum)

    val findNumTwo = evenNumberList.findLast {
        it < 8 // find last number that is smaller than eight
    }
    println(findNumTwo)


    // if i need a specific predicate for my all application i can create predicate and i can use it anywhere.
    val myPredicate = {num : Int -> num >5}
    val allCheckWithPredicate = evenNumberList.all(myPredicate)
    println("All checked with predicate: $allCheckWithPredicate")


}