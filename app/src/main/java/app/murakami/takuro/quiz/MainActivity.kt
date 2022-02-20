package app.murakami.takuro.quiz


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.murakami.takuro.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val quizIntent:Intent = Intent(this,QuizActivity::class.java)

        binding.startButton.setOnClickListener {
            startActivity(quizIntent)
        }
    }
}