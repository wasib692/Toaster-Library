package com.appsol360.githublibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.appsol360.toasterllibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(MainActivity.this,"hELLO");
    }
}