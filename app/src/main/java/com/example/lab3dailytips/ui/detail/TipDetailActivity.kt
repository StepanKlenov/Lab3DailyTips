package com.example.lab3dailytips.ui.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3dailytips.R

class TipDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip_detail)

        val day = intent.getIntExtra("day", 0)
        val title = intent.getStringExtra("title") ?: ""
        val fullDescription = intent.getStringExtra("fullDescription") ?: ""
        val imageResId = intent.getIntExtra("imageResId", R.drawable.ic_launcher_foreground)

        findViewById<ImageView>(R.id.detail_image).setImageResource(imageResId)
        findViewById<TextView>(R.id.detail_day).text = "День $day"
        findViewById<TextView>(R.id.detail_title).text = title
        findViewById<TextView>(R.id.detail_full_desc).text = fullDescription
    }
}