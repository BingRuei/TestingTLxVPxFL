package com.ray.test.testingtlxvpxfl;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    // Setting your tabs
    private String[] titles = new String[]{"Tab1(+)", "Tab2(-)", "Tab3(x)", "Tab4(/)"};
//    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
//        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        // Deciding which activity on which Tab
        switch (position){
            case 0:
                return new PageFragment1().newInstance(position+1);
            case 1:
                return new PageFragment2().newInstance(position+1);
            case 2:
                return new PageFragment3().newInstance(position+1);
            default:
                return new PageFragment4().newInstance(position+1);
        }
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}