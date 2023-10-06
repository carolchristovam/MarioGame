package com.example.mariogame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mariogame.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val numbersList: MutableList<Int> = mutableListOf()
    private var advance = 0

    private val imgsList: MutableList<Int> = mutableListOf(
        R.drawable.n0, R.drawable.n1, R.drawable.n2, R.drawable.n3,
        R.drawable.n4, R.drawable.n5, R.drawable.n6, R.drawable.n7,
        R.drawable.n8, R.drawable.n9, R.drawable.n10, R.drawable.bloco
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }

    private fun randomNumbers(view: View, typeNumber2: Int ){

        for(n in 0 .. 11) {
            numbersList.add(n)
        }

        val nRandom = Random.nextInt(11)

        val imgNumber = when (nRandom){
            0 -> {
                imgsList[0]
            }
            1 -> {
                imgsList[1]
            }
            2 -> {
                imgsList[2]
            }
            3 -> {
                imgsList[3]
            }
            4 -> {
                imgsList[4]
            }
            5 -> {
                imgsList[5]
            }
            6 -> {
                imgsList[6]
            }
            7 -> {
                imgsList[7]
            }
            8 -> {
                imgsList[8]
            }
            9 -> {
                imgsList[9]
            }
            10 -> {
                imgsList[10]
            }else -> {
                imgsList[11]
            }
        }

        if (typeNumber2 != nRandom){
            binding.surpriseNumber.setBackgroundResource(R.drawable.bloco)
            advance += 30
            binding.linearProgressIndicator.setProgress(advance,true)
        }else{
            advance -= 120
            binding.surpriseNumber.setBackgroundResource(imgNumber)
            binding.editNumber.setText("")
            binding.linearProgressIndicator.setProgress(advance,true)
            advance = 0

        }

        if (advance >90 ){

        }

    }

    private fun message (view: View){

    }
}