package com.example.myapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rollButton:Button =findViewById(R.id.rollButton)
        rollButton.setOnClickListener{
            rollDice()
            rolDice2()
       }
    }

    private fun rolDice2() {
        val randomInt = Random().nextInt(6)+1
        val drawableResources = when (randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        val diceImage:ImageView = findViewById(R.id.dice_img2)
        diceImage.setImageResource(drawableResources)

    }


    private fun rollDice() {

      val randomInt = Random().nextInt(6)+1
      val drawableResources = when (randomInt){
          1-> R.drawable.dice_1
          2-> R.drawable.dice_2
          3-> R.drawable.dice_3
          4-> R.drawable.dice_4
          5-> R.drawable.dice_5
        else-> R.drawable.dice_6
      }
      val diceImage:ImageView = findViewById(R.id.dice_img)
      diceImage.setImageResource(drawableResources)

   }


}