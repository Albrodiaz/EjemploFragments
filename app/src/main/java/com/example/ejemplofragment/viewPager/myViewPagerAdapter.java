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
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = FragmentOne.newInstance();
                break;
            case 1:
                fragment = FragmentTwo.newInstance();
                break;
            case 2:
                fragment = FragmentThree.newInstance();
                break;
            default:
                Log.e("FragmentError", "Posición no encontrada" + position);
        }

        assert fragment != null;
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
