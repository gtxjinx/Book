package com.example.jinx.bookexchage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Jinx on 2017/3/25 13:51.
 */

public class MainAdapter extends FragmentPagerAdapter
{
    private ArrayList<Fragment> fragmentArrayList;



    public MainAdapter(FragmentManager fm, ArrayList<Fragment> fragmentArrayList)
    {
        super(fm);
        this.fragmentArrayList = fragmentArrayList;
    }

    @Override
    public int getCount()
    {
        return fragmentArrayList.size();
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragmentArrayList.get(position);
    }
}
