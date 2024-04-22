package com.example.a13pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

//ver 01 simple, static
//ver 02 multiple layout xmls

public class MainActivity extends AppCompatActivity {
    // https://www.androidhive.info/2020/01/viewpager2-pager-transformations-intro-slider-pager-animations-pager-transformations/
    // https://intensecoder.com/android-swipe-views-using-viewpager2-tutorial-in-kotlin/
    private int[] pages = {R.layout.page01, R.layout.page02, R.layout.page03};
    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);
        viewPager2.setAdapter(new MyViewPager2Adapter(pages));
    }
}