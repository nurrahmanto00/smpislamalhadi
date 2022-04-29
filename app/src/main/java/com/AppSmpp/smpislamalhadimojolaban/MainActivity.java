package com.AppSmpp.smpislamalhadimojolaban;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profilclick(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
    public void gurudanstaffclick(View view) {
        Intent intent = new Intent(MainActivity.this, GurudanstaffActivity.class);
        startActivity(intent);
    }
    public void ekstrakurikulerclick(View view) {
        Intent intent = new Intent(MainActivity.this, EkstrakurikulerActivity.class);
        startActivity(intent);
    }
    public void fasilitasclick(View view) {
        Intent intent = new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }
    public void eperpusclick(View view) {
        Intent intent = new Intent(MainActivity.this, EperpusActivity.class);
        startActivity(intent);
    }
}

