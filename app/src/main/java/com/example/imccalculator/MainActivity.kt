package com.example.imccalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener {
            val h = (altura.text).toString().toFloat() / 100
            val w = peso.text.toString().toFloat()
            val res = w / (h * h)
            result.text = "%.2f".format(res)

            val grau = res


            resultGrau.text = when {
                grau <= 18.5 -> "GRAU 0 | MAGREZA"
                grau in 18.6..25.0 -> "GRAU 0 | NORMAL" // GREEN
                grau in 25.1..29.9 -> "GRAU 1 | SOBREPESO" // ORANGE
                grau in 30.0..39.9 -> "GRAU 2 | OBESIDADE"// RED
                grau > 40.0 -> "GRAU 3 | OBESIDADE GRAVE" // RUBY
                else -> "GRAU 00"

            }


            if(grau in 18.6..25.9){
                result.setTextColor(Color.GREEN)
            }
            else{
                result.setTextColor(Color.RED)
            }


            }
        }
    }
