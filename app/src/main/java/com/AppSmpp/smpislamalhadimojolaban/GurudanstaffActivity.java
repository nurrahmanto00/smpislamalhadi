package com.AppSmpp.smpislamalhadimojolaban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GurudanstaffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurudanstaff);
    }
    public void backgurudanstaffclick(View view) {
        Intent intent = new Intent(GurudanstaffActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
