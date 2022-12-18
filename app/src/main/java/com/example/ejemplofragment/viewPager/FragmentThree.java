package com.example.ejemplofragment.viewPager;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.R;
import com.example.ejemplofragment.databinding.FragmentThreeBinding;

public class FragmentThree extends Fragment {

    private FragmentThreeBinding binding;

    public FragmentThree() { }

    public static FragmentThree newInstance() {
        return new FragmentThree();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThreeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        return view;
    }
}