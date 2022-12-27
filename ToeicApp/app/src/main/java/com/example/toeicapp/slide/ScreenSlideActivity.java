package com.example.toeicapp.slide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.toeicapp.R;

public class ScreenSlideActivity extends FragmentActivity {

    private static final int NUM_PAGES =5;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen_slide);

        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlideActivity(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }
}