package com.example.viewpager2classproject1

import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    //Step1: Declare variables

    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: ViewPagerAdapter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

//Step 2: Create ViewPagerAdapter Class
class ViewPagerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    //Step 4: Create a list of items
    private val itemList = listOf(
        "Sometimes life gets the best of you",
        "It's ok to fall down","as long as you stand back up")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}

//Step 5: Implement members



//Step3: Create ViewHolder Class
class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val pagerText: TextView = itemView.findViewById(R.id.pagerText)
    fun bind(item: String){
        pagerText.text = item
    }
}