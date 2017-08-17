package com.easylabs.androidexample_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btCreateNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCreateNewActivity = (Button) findViewById(R.id.btCreateNewActivity);

        btCreateNewActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Создаем намерение, для создания нового окна
        Intent intent = new Intent(this, SecondActivity.class);

        // Помещаем данные
        intent.putExtra("num", 10);

        // Создаем новое окно
        startActivity(intent);
    }
}
