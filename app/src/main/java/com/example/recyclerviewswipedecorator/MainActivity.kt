package com.example.recyclerviewswipedecorator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewswipedecorator.model.WeekModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var weekList:ArrayList<WeekModel>
    private lateinit var adapter:RVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)

        val w1 = WeekModel(1,1,2,3,4,5,6,7)
        val w2 = WeekModel(2,8,9,10,11,12,13,14)
        val w3 = WeekModel(3,15,16,17,18,19,20,21)
        val w4 = WeekModel(4,22,23,24,25,26,27,28)
        val w5 = WeekModel(5,29,30,1,2,3,4,5)

        weekList = ArrayList<WeekModel>()
        weekList.add(w1)
        weekList.add(w2)
        weekList.add(w3)
        weekList.add(w4)
        weekList.add(w5)

        adapter = RVAdapter(this,weekList)
        rv.adapter  = adapter
    }
}