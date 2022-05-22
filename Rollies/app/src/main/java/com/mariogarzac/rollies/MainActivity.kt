package com.mariogarzac.rollies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //COMPONENTES
    val rollButton : Button = findViewById(R.id.button_TirarDado)
    val diceImage : ImageView = findViewById(R.id.imageView_Dado)

    fun rollDice(){
        val dice = Dice()
        var diceFace = dice.roll()

        val diceImage : ImageView = findViewById(R.id.imageView_Dado)
        set
    }

    //CLASE DADO
    class Dice{
        fun roll() : Int{
            val image = arrayOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)

            return image.random()
        }
    }
}

//Para imprimir
//Log.i("APP","Este es un mensaje de prueba")
//val rollButton: Button = findViewby<Button>(R.id.button_TirarDado)