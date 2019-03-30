package com.example.googrydrawerlayoutlesson

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawer_root.addDrawerListener(object :
            DrawerLayout.DrawerListener{

            override fun onDrawerStateChanged(newState: Int) {
                when (newState){
                    DrawerLayout.STATE_IDLE -> {
                        Log.d("googry", "DrawerLayout.STATE_IDLE")
                    }
                    DrawerLayout.STATE_DRAGGING -> {
                        Log.d("googry", "DrawerLayout.STATE_DRAGGING")
                    }
                    DrawerLayout.STATE_SETTLING -> {
                        Log.d("googry", "DrawerLayout.STATE_SETTLING")
                    }
                }
            }

            override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                Log.d("googry", "slideOffset "+slideOffset)
            }

            override fun onDrawerClosed(drawerView: View) {
                Log.d("googry", "Drawer 닫혔을 때")
            }

            override fun onDrawerOpened(drawerView: View) {
                Log.d("googry", "Drawer 열렸을 때")
            }
        })

        button_open_left.setOnClickListener{
            drawer_root.openDrawer(frame_left_side)
        }
        button_open_left_non_animate.setOnClickListener{
            drawer_root.openDrawer(frame_left_side, false)
        }

        button_open_right.setOnClickListener{
            drawer_root.openDrawer(frame_right_side)
        }
        button_open_right_non_animate.setOnClickListener{
            drawer_root.openDrawer(frame_right_side, false)
        }
    }
}
