package com.mariogarzac.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariogarzac.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


        var todoList = mutableListOf(
            Todo ("Opción 1", false),
            Todo ("Opción 2", false),
            Todo ("Opción 3",  false),
            Todo ("Opción 4", false),
            Todo ("Opción 5", false),
            Todo ("Opción 6", false),
            Todo ("Opción 7", false)
        )

    }
}