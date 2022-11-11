package com.example.ejemplofragment.viewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.R;

public class FragmentThree extends Fragment {

    public FragmentThree() { }

    public static FragmentThree newInstance() {
        return new FragmentThree();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }
}