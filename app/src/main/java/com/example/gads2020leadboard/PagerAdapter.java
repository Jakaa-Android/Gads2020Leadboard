package com.example.gads2020leadboard;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter( FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs=NumOfTabs;
    }

    /**
     *Return the Fragment associated with a specified position
     *
     * @param position
     *
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Fragment();
            case 1: return new Fragment();
            default:return null;
        }
    }

    /**
     * Return the number of views available.
     */

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
