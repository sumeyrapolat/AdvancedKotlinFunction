package com.sumeyra.advancedkotlinfunctions

fun main(){

 val myNumberList= listOf<Int>(1,3,5,7,9,11,13,15,17,19)

    //Filter:

    val smallNumber = myNumberList.filter { it<10 }
    println("Smaller than 10 : $smallNumber")

    val biggerNumber = myNumberList.filter { it >6 }
    println("Bigger than 6: $biggerNumber")

    val newNumber = myNumberList.filter { it > 16 }
    for (num in newNumber){
        println("New number: $num")
    }

    //Map:

    val nums = myNumberList.map {
        it *3
    }

    println("Three times of my numbers: $nums")


    val squaredNumbers = myNumberList.map { it*it }
    println("Square of my list: $squaredNumbers")

    // Apply filter and map together

    val mixNumber = myNumberList.filter { it > 10 }.map { it *4 }
    println("My mixed number: $mixNumber")


   val polatMemberList = listOf<PolatFamily> (
   PolatFamily("Sümeyra",24),
   PolatFamily("Hümeyra",24),
   PolatFamily("Rüveyda",29)
   )

   //Polat ailesinde yaşları 23 olanların isimlerini almak istiyorum

   val twins = polatMemberList.filter {
      it.age ==24
   }.map {
      it.name
   }
    println(twins)
    println("Twins names are " + twins[0]+" and "+twins[1])



}

data class PolatFamily(val name: String, val age: Int)


