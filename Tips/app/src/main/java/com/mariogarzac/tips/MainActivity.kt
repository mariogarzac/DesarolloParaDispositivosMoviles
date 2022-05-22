package com.mariogarzac.tips

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mariogarzac.tips.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener{
            calculateTip()
        }

    }

    private fun calculateTip(){
        val input = binding.costOfService.text.toString()
        val roundUp = binding.switchRoundUp.isChecked


        if(input.isEmpty()){
            Toast.makeText(this, "Favor de agregar un valor de consumo", Toast.LENGTH_SHORT).show()
            return
        }

        val cost = input.toDouble()

        val tipPercentage = when (binding.radioGroupTipAmount.checkedRadioButtonId) {
            R.id.radioButton_Tip20 -> 1.20
            R.id.radioButton_Tip18 -> 1.18
            R.id.radioButton_Tip15 -> 1.15
            else -> 1.10
        }

        var result = tipPercentage * cost
        if (roundUp){
            result = kotlin.math.ceil(result)
        }

        binding.textViewTotal.text = "El total a pagar es $result"

    }


}