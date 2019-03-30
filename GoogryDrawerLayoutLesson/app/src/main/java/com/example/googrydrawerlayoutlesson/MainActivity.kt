package com.example.googrydrawerlayoutlesson

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_open_left.setOnClickListener{
            drawer_root.openDrawer(frame_left_side)
        }
        button_open_left_non_animate.setOnClickListener{
            drawer_root.openDrawer(frame_left_side, false)
        }
    }
}
