package com.example.homework6_4.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homework4.ButtonsFragment
import com.example.homework4.CounterFragment
import com.example.homework4.OperationsFragment

class PagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    val count = 3

    override fun getItemCount(): Int = count

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0->{
                ButtonsFragment()
            }
            1->{
                CounterFragment()
            }
            2->{
                OperationsFragment()
            }
            else -> ButtonsFragment()
        }
    }

}