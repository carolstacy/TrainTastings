package com.example.traintastings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import kotlin.math.log

class Search : AppCompatActivity() {
    lateinit var menu:ImageView
    lateinit var logo:ImageView
    lateinit var bell:ImageView
    lateinit var search:SearchView
    lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        menu=findViewById(R.id.img_bell)
        logo=findViewById(R.id.img_logo)
        bell=findViewById(R.id.img_bell)
        search=findViewById(R.id.searchView)
        recycler=findViewById(R.id.recyclerView)
    }
}
