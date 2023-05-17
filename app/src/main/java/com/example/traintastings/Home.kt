package com.example.traintastings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display.Mode
import android.widget.ListView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView=findViewById<ListView>(R.id.listvieww)
        var list= mutableListOf<Models>()


//        adding image
        list.add(Models("black","This is a black astheitic",R.drawable.stac))
        list.add(Models("red","This is a red astheitic",R.drawable.stac2))
        list.add(Models("blue","This is a blue astheitic",R.drawable.stac3))
        list.add(Models("maroon","This is a maroon dress",R.drawable.dress1))
        list.add(Models("green","This is a green dress",R.drawable.dress2))
        list.add(Models("purple","This is a purple dress",R.drawable.dress3))

        listView.adapter=MyAdapter(this,R.layout.row,list)

        val intent1 = Intent(this, rice::class.java)
        startActivity(intent1)

        listView.setOnItemClickListener { _, _, position, _ -> val selectedItem = data_source[position] val intent = Intent(this, TitleActivity::class.java) intent[i].putExtra("title", selectedItem) startActivity(intent) }

    }
}