package com.example.ejemplofragment.comunicaciónFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ejemplofragment.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding;
    FragmentsViewModel viewModel;

    public SecondFragment() {}

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(FragmentsViewModel.class);
        binding.Fragment2editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                viewModel.setSharedText(s.toString());
            }
        });

        binding.titleButton.setOnClickListener(v-> {
            viewModel.setToolbarTitle(binding.titleEditText.getText().toString());
        });
    }
}