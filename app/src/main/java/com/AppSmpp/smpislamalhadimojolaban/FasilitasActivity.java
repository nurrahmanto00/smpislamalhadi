package com.AppSmpp.smpislamalhadimojolaban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FasilitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);
    }
    public void backfasilitasclick(View view) {
        Intent intent = new Intent(FasilitasActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
