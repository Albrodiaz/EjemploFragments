package com.example.ejemplofragment.comunicacionFragments1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.databinding.FragmentThirdBinding;


public class FragmentThird extends Fragment {

    private FragmentThirdBinding binding;

    public FragmentThird() {
        // Required empty public constructor
    }

    public static FragmentThird newInstance() {
        return new FragmentThird();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}