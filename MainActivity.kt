package com.raithavarta.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.raithavarta.app.R
import com.raithavarta.app.adapter.TipAdapter
import com.raithavarta.app.data.FakeData

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = TipAdapter(FakeData.tips)
    }
}
