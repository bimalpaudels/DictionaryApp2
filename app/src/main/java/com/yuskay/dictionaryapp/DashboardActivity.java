package com.yuskay.dictionaryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnDictionary, btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnDictionary = findViewById(R.id.btnDictionary);
        btnAdd = findViewById(R.id.btnAdd);

        btnDictionary.setOnClickListener(this);
        btnAdd.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnDictionary){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.btnAdd){
            Intent intent = new Intent(DashboardActivity.this, AddWord.class);
            startActivity(intent);
        }

    }
}
