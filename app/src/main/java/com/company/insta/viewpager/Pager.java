package com.company.insta.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by LENOVO on 4/5/2019.
 */

public class Pager extends FragmentStatePagerAdapter {
   int tabCount;
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int tabCount) {
        switch (tabCount){
            case 0:
                TabOne tabOne = new TabOne();
                return tabOne;
            case 1:
                TabTwo tabTwo = new TabTwo();
                return tabTwo;
            case 2:
                TabThree tabThree = new TabThree();
                return tabThree;

          default:
        return null;
    }
    }
    @Override
    public int getCount() {
        return tabCount;
    }
}
