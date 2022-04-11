package com.example.profilecard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.commentBtn)

        button.setOnClickListener {
            randomText()
        }
    }

    private fun randomText() {
//        creating an array of string
        val text: Array<String> = arrayOf("Hard working", "Lazy", "Somewhat Lazy","Very Lazy", "Dedicated" )
        val comment = Comment(text)
        val commentClicked = comment.mutateText()
//        updating the screen

        val commentTextId: TextView = findViewById(R.id.commentText)
        commentTextId.text = commentClicked

    }
}
class Comment (private val commentText: Array<String>){
    private var arraySize = commentText.size

     fun mutateText(): String{
         val randomComment = (0 until arraySize).random()
         return commentText[randomComment]
     }

}