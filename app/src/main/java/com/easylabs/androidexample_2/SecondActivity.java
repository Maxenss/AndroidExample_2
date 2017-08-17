package com.easylabs.androidexample_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получить намерение, которое создало окно
        Intent intent = getIntent();

        // Получаем данные из Intent
        int num = intent.getIntExtra("num", 0);

        // Выводим num в AndroidMonitor
        System.out.println(num);
    }
}
