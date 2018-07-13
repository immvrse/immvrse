package com.example.samson.immvrse;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.example.samson.immvrse.databinding.ActivityMyLocationBinding;


public class LocationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMyLocationBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_my_location);
        LocationViewModel viewModel = new LocationViewModel();
        binding.getRoot();
        binding.setViewModel(viewModel);
        binding.executePendingBindings();

        binding.notNowButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(LocationActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
            @Override
            public void onClick(View view) {
                viewModel.getFeedUsers();
            }
    });}
}
