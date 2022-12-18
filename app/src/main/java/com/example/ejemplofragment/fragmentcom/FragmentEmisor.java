package com.example.ejemplofragment.fragmentcom;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.R;
import com.example.ejemplofragment.databinding.FragmentEmisorBinding;

public class FragmentEmisor extends Fragment {


    private FragmentEmisorBinding binding;

    public FragmentEmisor() {
        // Required empty public constructor
    }

    public static FragmentEmisor newInstance() {
        return new FragmentEmisor();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmisorBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        return view;
    }
}