package com.example.testapllication1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testapllication1.fragments.ViewPagerFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_layout, new ViewPagerFragment())
                .commit();
    }
}