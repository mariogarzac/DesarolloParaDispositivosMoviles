package com.mariogarzac.examenparcial1

import androidx.appcompat.app.AppCompatActivity
import com.mariogarzac.examenparcial1.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Toast
import android.text.TextUtils
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusButton.setOnClickListener{
            binding.operandTextView.text = "+"
            binding.ResultTextView.text = calculate(1)

        }

        binding.minusButton.setOnClickListener{
            binding.operandTextView.text = "-"
            binding.ResultTextView.text = calculate(2)

        }

        binding.multiplyButton.setOnClickListener{
            binding.operandTextView.text = "*"
            binding.ResultTextView.text = calculate(3)
        }

        binding.divideButton.setOnClickListener{
            binding.operandTextView.text = "/"
            binding.ResultTextView.text = calculate(4)
        }
    }

    private fun calculate(operand : Int) : String{
        val num1String = binding.Num1EditText.text.toString()
        val num2String = binding.Num2EditText.text.toString()

        if (TextUtils.isEmpty(num1String) || TextUtils.isEmpty(num2String)) {
            Toast.makeText(this, "Ingresa dos números", Toast.LENGTH_SHORT).show()
        }else{
            val num1 = num1String.toDouble()
            val num2 = num2String.toDouble()

            val result = when(operand){
                1 ->  num1 + num2
                2 ->  num1 - num2
                3 ->  num1  * num2
                else ->  (num1  / num2)
            }
            val round = (result * 100.0).roundToInt() / 100.0
            return "= $round"
        }
        return "="
    }
}