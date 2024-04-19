package com.example.Tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplicationtuan1.R

class T3ListViewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter?=null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t3_list_view_main)
        var lv=findViewById<ListView>(R.id.t3_list_view)
        ls.add(T3Contact("Nguyen Van A","20",R.drawable.android))
        ls.add(T3Contact("Nguyen Van A","20",R.drawable.apple))
        ls.add(T3Contact("Nguyen Van A","20",R.drawable.chrome))
        ls.add(T3Contact("Nguyen Van A","20",R.drawable.fb))
        ls.add(T3Contact("Nguyen Van A","20",R.drawable.edge))
        adapter=T3Adapter(ls,this)
        lv!!.adapter=adapter
    }
}