package com.example.ejemplofragment.viewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.R;

public class FragmentTwo extends Fragment {

    public FragmentTwo() { }

    public static FragmentTwo newInstance() {
        return new FragmentTwo();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
}