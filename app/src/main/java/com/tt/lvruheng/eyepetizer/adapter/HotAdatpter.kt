package com.tt.lvruheng.eyepetizer.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import android.view.View

/**
 * Created by lvruheng on 2017/7/6.
 */
class HotAdatpter(fm: androidx.fragment.app.FragmentManager, list: ArrayList<androidx.fragment.app.Fragment>, titles : MutableList<String>) : androidx.fragment.app.FragmentPagerAdapter(fm) {
    var mFm : androidx.fragment.app.FragmentManager = fm!!
    var mList : ArrayList<androidx.fragment.app.Fragment> = list
    var mTitles : MutableList<String> = titles
    override fun getItem(position: Int): androidx.fragment.app.Fragment {
        return mList[position]

    }
    override fun getCount(): Int {
        return mList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mTitles[position]
    }

}