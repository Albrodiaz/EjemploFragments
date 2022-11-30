package com.example.ejemplofragment.comunicacionFragments1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.R;
import com.example.ejemplofragment.databinding.FragmentFirstBinding;
import com.example.ejemplofragment.databinding.FragmentFourthBinding;

public class FragmentFourth extends Fragment {

    private FragmentFourthBinding binding;

    public FragmentFourth() {
        // Required empty public constructor
    }

    public static FragmentFourth newInstance() {
        return new FragmentFourth();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFourthBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}