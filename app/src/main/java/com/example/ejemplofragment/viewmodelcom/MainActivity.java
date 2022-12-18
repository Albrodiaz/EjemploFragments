package com.example.ejemplofragment.viewmodelcom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.example.ejemplofragment.R;
import com.example.ejemplofragment.databinding.ActivityMainBinding;
import com.example.ejemplofragment.viewPager.ActivityViewPager;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FragmentsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(FragmentsViewModel.class);

        binding.mainToolbar.setNavigationOnClickListener(v -> startActivity(new Intent(this, ActivityViewPager.class)));

        binding.btnFragment1.setOnClickListener(v -> inflateFragment1());
        binding.btnFragment2.setOnClickListener(v -> inflateFragment2());

        viewModel.getToolbarTitle().observe(this, title -> {
            if (title != null) {
                binding.mainToolbar.setTitle(title);
            } else {
                binding.mainToolbar.setTitle(getString(R.string.app_name));
            }
        });
    }

    private void inflateFragment1() {
        getSupportFragmentManager().beginTransaction()
                .replace(binding.fragment1Container.getId(), FirstFragment.newInstance(), "FirstFragment")
                .commit();

    }

    private void inflateFragment2() {
        getSupportFragmentManager().beginTransaction()
                .replace(binding.fragment2Container.getId(), SecondFragment.newInstance(), "SecondFragment")
                .commit();
    }
}