package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    //2 after testing the button create a list
    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // selectedFoodTxt.text = "Burger King"
        decideBtn.setOnClickListener {
            //println("You clicked me!") we know this is working as this message is appeared the number of times we click the button
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }

    }
}


//Tricks
//1 Comment cmd + fwd /
//2 Command+shift+slash--multi line
//reformat Code
//3-Reformat follow below
//Mac-Option+L
//Win-Ctrl+Alt+L
//4
//HIGLIGHT
//SHIFT+CTRL+<-->
//5 S+C+UPARROW OR dOWN ONE
//6 DUPLICATE LINE->CTRL+D

//7
// c+S+A --> SERACH ANYTHING
// 8 - RIGHTCLICK SPLIT
//9 - DOUBLE CLICK ON SHIFT--TYPE FIND ME-- TO DO SEARCH EVERYWHERE
//10-CTRL+ O METHODS TO OVERRIDE
//11 con restore what copy earlier c+s+v