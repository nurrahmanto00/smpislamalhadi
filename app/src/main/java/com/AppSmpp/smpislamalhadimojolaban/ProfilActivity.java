package com.AppSmpp.smpislamalhadimojolaban;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }
    public void backprofilclick(View view) {
        Intent intent = new Intent(ProfilActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
