package com.gupta54622.rahul.bookcase;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerBookDetails;
    private BookDetailsPagerAdapter bookDetailsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.viewPagerBookDetails = findViewById(R.id.bookDetailsViewPager);

        this.bookDetailsPagerAdapter =  new BookDetailsPagerAdapter(getSupportFragmentManager());

        viewPagerBookDetails.setAdapter(this.bookDetailsPagerAdapter);
    }
}
