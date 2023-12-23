package com.sumeyra.advancedkotlinfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var initialNumber : Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //LET

        if(initialNumber!=null){
            initialNumber = initialNumber!!+1
        }

        initialNumber?.let{
            val num = it+1
        }

        initialNumber?.let{
            it*2
        }?:0

        //ALSO

        val p1 = Person("Sümeyra",24)
        val p2 = Person("Bedirhan",24)
        val p3 = Person("Miray",1)

        val myFamily = listOf<Person>(p1,p2,p3)

       /* val parent = myFamily.filter { it.age> 18 }.map { it.name}
        println("Mama and papa are $parent")*/

        val parent = myFamily.filter { it.age>23 }.also {
            for (person in it){
                println(person.name)
            }
        }
    }
    private data class Person(val name: String, val age: Int)

}