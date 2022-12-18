package com.example.ejemplofragment.fragmentcom;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.R;
import com.example.ejemplofragment.databinding.FragmentReceptorBinding;

public class FragmentReceptor extends Fragment {

    FragmentReceptorBinding binding;

    public FragmentReceptor() {
        // Required empty public constructor
    }

    public static FragmentReceptor newInstance() {
        return new FragmentReceptor();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentReceptorBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}