package com.example.ejemplofragment.viewPager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejemplofragment.R;
import com.example.ejemplofragment.databinding.ActivityViewPagerBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class ActivityViewPager extends AppCompatActivity {

    ActivityViewPagerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewPagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initViewPagerTabs();
    }

    private void initViewPagerTabs() {
        binding.viewPagerContainer.setAdapter(new myViewPagerAdapter(this));

        new TabLayoutMediator(binding.mainTab, binding.viewPagerContainer, (tab, position) -> {
           switch (position) {
               case 0:
                   tab.setIcon(R.drawable.baseline_contact_support_white_24dp);
                   break;
               case 1:
                   tab.setIcon(R.drawable.baseline_commute_white_24dp);
                   break;
               case 2:
                   tab.setIcon(R.drawable.baseline_article_white_24dp);
                   break;
           }
        }).attach();
    }
}