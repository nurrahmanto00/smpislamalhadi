package com.AppSmpp.smpislamalhadimojolaban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EkstrakurikulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakurikuler);
    }
    public void backekstrakurikulerclick(View view) {
        Intent intent = new Intent(EkstrakurikulerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
