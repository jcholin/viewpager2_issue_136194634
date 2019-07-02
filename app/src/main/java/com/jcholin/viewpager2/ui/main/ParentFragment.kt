package com.jcholin.viewpager2.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.jcholin.viewpager2.R

/*
 * Created by Julien Cholin on 2019-07-02
 * Copyright (c) 2019 Frizbiz. All rights reserved.
 */
class ParentFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var tabLayoutMediator: TabLayoutMediator

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_parent, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager = view.findViewById(R.id.view_pager)
        tabLayout = view.findViewById(R.id.tabs)

        val fragments = listOf<Fragment>(
            ChildFragment(), ChildFragment(), ChildFragment()
        )

        viewPager.adapter = FragmentAdapter(fragments, activity!!)

        tabLayoutMediator = TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = "$position"
        }
        tabLayoutMediator.attach()
    }
}