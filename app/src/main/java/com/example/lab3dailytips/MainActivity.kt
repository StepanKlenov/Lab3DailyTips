package com.example.lab3dailytips

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3dailytips.data.TipsData
import com.example.lab3dailytips.ui.adapter.TipAdapter
import com.example.lab3dailytips.ui.detail.TipDetailActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val tips = TipsData.getAllTips()

        val adapter = TipAdapter(tips) { selectedTip ->
            val intent = Intent(this, TipDetailActivity::class.java).apply {
                putExtra("day", selectedTip.day)
                putExtra("title", selectedTip.title)
                putExtra("fullDescription", selectedTip.fullDescription)
                putExtra("imageResId", selectedTip.imageResId)
            }
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}