package com.gods.y.groupon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.gods.y.groupon.fragment.GuideAFragment;
import com.gods.y.groupon.fragment.GuideBFragment;
import com.gods.y.groupon.fragment.GuideCFragment;
import com.gods.y.groupon.fragment.GuideDFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class GuideFragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;

    public GuideFragmentAdapter(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>();
        fragments.add(new GuideAFragment());
        fragments.add(new GuideBFragment());
        fragments.add(new GuideCFragment());
        fragments.add(new GuideDFragment());
    }


    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
}
