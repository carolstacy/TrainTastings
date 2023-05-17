
package com.example.traintastings

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mycntx:Context,var resources:Int,var items:List<Models>):ArrayAdapter<Models>(mycntx,resources,items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mycntx)
        val view: View = layoutInflater.inflate(resources, null)
        val imageView: ImageView = view.findViewById(R.id.image)
        val Tv_tittle: TextView = view.findViewById(R.id.textView1)
        val Tv_description: TextView = view.findViewById(R.id.textView2)

        var myitems: Models = items[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        Tv_tittle.text = myitems.tittle
        Tv_description.text = myitems.description

        return view
    }
}