package com.sample.databindinglivedataskin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.sample.databindinglivedataskin.databinding.ActivityFragmentBinding;

public class FragmentActivity extends AppCompatActivity {
    ActivityFragmentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_fragment);
        FragmentSample fragment = new FragmentSample();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container,fragment,"FragmentSample");
        transaction.commit();
    }
}