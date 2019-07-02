package com.jcholin.viewpager2.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/*
 * Created by Julien Cholin on 2019-07-02
 * Copyright (c) 2019 Frizbiz. All rights reserved.
 */

class FragmentAdapter(private val fragments: List<Fragment>, fragmentActivity: FragmentActivity) : FragmentStateAdapter(
    fragmentActivity) {
    override fun createFragment(position: Int): Fragment = fragments[position]
    override fun getItemCount(): Int = fragments.size
}

