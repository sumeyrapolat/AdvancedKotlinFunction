package com.sumeyra.advancedkotlinfunctions

import android.content.Intent

fun main(){

    //APPLY

   /* //old and basic level
    val intent = Intent()
    intent.putExtra("","")
    intent.`package`=""
    intent.putExtra("","")
    */


    //new and advanced
    /* val intent2 = Intent().apply {
         putExtra("", "")
         `package` = ""
         putExtra("", "")
     }*/

    Person("barley",24).apply {
        name= "Barney"
    }.also {
        println("apply "+it.name)
    }

    val withBarney = Person("arley",23)
    with(withBarney){
        name= "Köpek Barney"
    }
    println(withBarney.name)



    //WITH




}
private class Person(var name: String, var age: Int)
