package com.mariogarzac.converter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mariogarzac.converter.databinding.ActivityMainBinding
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.CalculateButton.setOnClickListener(){
            val text = binding.TempEditText.text.toString()
            if (text == ""){
                Toast.makeText(this, "No se ingresó una temperatura. ", Toast.LENGTH_SHORT).show()
            }else {
                calculateTemp()
            }
        }
    }

    private fun calculateTemp(){
        //val button = binding.radioGroup2.checkedRadioButtonId

        val choiceOne = binding.radioGroupChoiceOne.checkedRadioButtonId
        val choiceTwo = binding.radioGroupChoiceTwo.checkedRadioButtonId
        val degrees = (binding.TempEditText.text.toString()).toDouble()
        var result: Double = 0.0

        if (choiceOne == -1 || choiceTwo == -1) {
            Toast.makeText(this, "Selecciona dos opciones", Toast.LENGTH_SHORT).show()
        }else {
            if (binding.FahrenheitTop.isChecked) {
                if (binding.CelciusBot.isChecked){
                    result = ((degrees - 32) * 5/9)
                }else if(binding.KelvinBot.isChecked){
                    result = (((degrees - 32) * 5 / 9) + 273.15)
                }else{
                    result = degrees
                }
            } else if (binding.CelciusTop.isChecked) {
                if (binding.FahrenheitBot.isChecked){
                    result = (degrees + 9 / 5) + 32
                }else if (binding.KelvinBot.isChecked){
                    result = degrees + 273.15
                }else{
                    result = degrees
                }
            } else {
                if (binding.FahrenheitBot.isChecked){
                    result = (degrees - 273.15) * 9 / 5 + 32
                }else if (binding.CelciusBot.isChecked){
                    result = degrees - 273.15
                }else{
                    result = degrees
                }
            }
        }
        val roundoff = (result * 100.0).roundToInt() / 100.0
        binding.ResultTextView.text = roundoff.toString()
    }

}