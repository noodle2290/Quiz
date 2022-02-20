package app.murakami.takuro.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.murakami.takuro.quiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val quizCount: Int = intent.getIntExtra("QuizCount",0)

        binding.quizCountText.text = "$quizCount 問中・・・"

        val correctCount:Int = intent.getIntExtra("CorrectCount",0)

        binding.correctCountText.text = correctCount.toString()

        binding.againButton.setOnClickListener {

            val quizIntent = Intent(this,QuizActivity::class.java)

            startActivity(quizIntent)

        }
    }
}