package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
    public void Kamar(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }


    @Override
    public void onBackPressed() {
        finish();
    }


}
