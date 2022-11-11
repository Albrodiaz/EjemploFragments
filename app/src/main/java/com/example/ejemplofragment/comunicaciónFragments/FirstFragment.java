package com.example.ejemplofragment.comunicaciónFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.databinding.FragmentFirstBinding;
import com.example.ejemplofragment.databinding.FragmentSecondBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private FragmentsViewModel viewModel;

    public FirstFragment() {}

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(FragmentsViewModel.class);
        viewModel.getSharedText().observe(getViewLifecycleOwner(), text-> binding.dinamicTextView.setText(text));

    }
}