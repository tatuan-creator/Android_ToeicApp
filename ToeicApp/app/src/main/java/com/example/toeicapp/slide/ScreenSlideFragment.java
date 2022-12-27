package com.example.toeicapp.slide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toeicapp.R;

public class ScreenSlideFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.activity_screen_slide_fragment, container, false);

        return rootView;
    }
}