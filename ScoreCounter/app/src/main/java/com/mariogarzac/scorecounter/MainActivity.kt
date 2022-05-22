package com.mariogarzac.scorecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.mariogarzac.scorecounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mScoreViewModel: ScoreViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mScoreViewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)
        displayScoreA()
        displayScoreB()

        binding.buttonA1.setOnClickListener{
            mScoreViewModel.addScoreA(1)
            displayScoreA()

        }
        binding.buttonA2.setOnClickListener{
            mScoreViewModel.addScoreA(2)
            displayScoreA()

        }
        binding.buttonA3.setOnClickListener{
            mScoreViewModel.addScoreA(3)
            displayScoreA()

        }

        binding.buttonB1.setOnClickListener{
            mScoreViewModel.addScoreB(1)
            displayScoreB()

        }

        binding.buttonB2.setOnClickListener{
            mScoreViewModel.addScoreB(2)
            displayScoreB()

        }

        binding.buttonB3.setOnClickListener{
            mScoreViewModel.addScoreB(3)
            displayScoreB()

        }

        binding.buttonReset.setOnClickListener{
            mScoreViewModel.resetScore()
            displayScoreA()
            displayScoreB()
        }
    }

    private fun displayScoreA(){
        binding.teamAScore.text = mScoreViewModel.scoreTeamA.toString()
    }

    private fun displayScoreB(){
        binding.teamBScore.text = mScoreViewModel.scoreTeamB.toString()
    }
}