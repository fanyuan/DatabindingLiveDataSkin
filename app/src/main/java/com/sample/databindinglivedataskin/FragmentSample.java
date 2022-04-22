package com.sample.databindinglivedataskin;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sample.databindinglivedataskin.databinding.FragmentSampleBinding;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FragmentSample extends Fragment {
    FragmentSampleBinding binding;
    ThemeJava theme = new ThemeJava();

    public FragmentSample() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sample, container, false);
        binding.setLifecycleOwner(this);
        binding.setThemeJava(theme);

        binding.bt.setOnClickListener(view -> {
            theme.color.setValue(getResources().getColor(R.color.red));
        });
        //inflater.inflate(R.layout.fragment_sample, container, false);
        return binding.getRoot();
    }
}