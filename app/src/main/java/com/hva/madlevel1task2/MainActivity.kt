package com.hva.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hva.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var correctAnswers: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.submitBtn.setOnClickListener {
            checkAnswerFirstRow()
            checkAnswerSecondRow()
            checkAnswerThirdRow()
            checkAnswerFourthRow()

            Toast.makeText(this, getString(R.string.correct_answers, correctAnswers), Toast.LENGTH_LONG).show()
            clearText()
            correctAnswers = 0
        }
    }

    private fun checkAnswerFirstRow() {
        val answer = binding.inputRow1.text.toString()

        if (answer == getString(R.string.T)) {
            correctAnswers++
        }
    }

    private fun checkAnswerSecondRow() {
        val answer = binding.inputRow2.text.toString()

        if (answer == getString(R.string.F)) {
            correctAnswers++
        }
    }

    private fun checkAnswerThirdRow() {
        val answer = binding.inputRow3.text.toString()

        if (answer == getString(R.string.F)) {
            correctAnswers++
        }
    }

    private fun checkAnswerFourthRow() {
        val answer = binding.inputRow4.text.toString()

        if (answer == getString(R.string.F)) {
            correctAnswers++
        }
    }

    private fun clearText() {
        binding.inputRow1.text.clear()
        binding.inputRow2.text.clear()
        binding.inputRow3.text.clear()
        binding.inputRow4.text.clear()
    }
}