package com.example.lab3dailytips   // ← замените на ваш реальный package name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3dailytips.data.TipsData
import com.example.lab3dailytips.ui.adapter.TipAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<com.google.android.material.appbar.MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val tips = TipsData.getAllTips()

        val adapter = TipAdapter(tips) { tip ->

            android.widget.Toast.makeText(this, "Открыт совет дня ${tip.day}: ${tip.title}",
                android.widget.Toast.LENGTH_SHORT).show()
        }

        recyclerView.adapter = adapter
    }
}