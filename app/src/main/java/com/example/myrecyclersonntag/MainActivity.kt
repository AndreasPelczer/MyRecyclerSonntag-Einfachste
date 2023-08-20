package com.example.myrecyclersonntag

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = mutableListOf(
            Item("Titel 1", "Beschreibung 1"),
            Item("Titel 2", "Beschreibung 2")
        )

        val recyclerView: RecyclerView = findViewById(R.id.RV)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(itemList)
    }
}