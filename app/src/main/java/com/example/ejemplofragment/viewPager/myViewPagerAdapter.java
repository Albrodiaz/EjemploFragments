package com.example.ejemplofragment.viewPager;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class myViewPagerAdapter extends FragmentStateAdapter {

    public myViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            default:
            case 0:
                return FragmentOne.newInstance();
            case 1:
                return FragmentTwo.newInstance();
            case 2:
                return FragmentThree.newInstance();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
