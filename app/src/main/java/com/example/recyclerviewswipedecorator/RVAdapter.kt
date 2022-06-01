package com.example.recyclerviewswipedecorator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewswipedecorator.model.WeekModel

class RVAdapter(val context: Context, val weekList:List<WeekModel>)
    : RecyclerView.Adapter<RVAdapter.CardViewHolder>() {

    inner class CardViewHolder(view: View): RecyclerView.ViewHolder(view){
        var cardViewRow: CardView
        var day_1: TextView
        var day_2: TextView
        var day_3: TextView
        var day_4: TextView
        var day_5: TextView
        var day_6: TextView
        var day_7: TextView

        init {
            cardViewRow = view.findViewById(R.id.cv)
            day_1 = view.findViewById(R.id.textView_day_1)
            day_2 = view.findViewById(R.id.textView_day_2)
            day_3 = view.findViewById(R.id.textView_day_3)
            day_4 = view.findViewById(R.id.textView_day_4)
            day_5 = view.findViewById(R.id.textView_day_5)
            day_6 = view.findViewById(R.id.textView_day_6)
            day_7 = view.findViewById(R.id.textView_day_7)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val design = LayoutInflater.from(context).inflate(R.layout.week_row,parent,false)
        return CardViewHolder(design)
    }

    override fun getItemCount(): Int {
        return weekList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val week = weekList[position]
        holder.day_1.text = week.monday.toString()
        holder.day_2.text = week.tuesday.toString()
        holder.day_3.text = week.wednesday.toString()
        holder.day_4.text = week.thursday.toString()
        holder.day_5.text = week.friday.toString()
        holder.day_6.text = week.saturday.toString()
        holder.day_7.text = week.sunday.toString()
    }
}