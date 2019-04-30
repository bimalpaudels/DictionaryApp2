package com.yuskay.dictionaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.PrintStream;

public class AddWord extends AppCompatActivity {

    private EditText etCountry, etCapital;
    private Button btnAddData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        etCountry = findViewById(R.id.etCountry);
        etCapital = findViewById(R.id.etCapital);
        btnAddData = findViewById(R.id.btnAddData);

        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Save();
            }
        });

    }

    private void Save(){
        try{
            PrintStream printStream = new PrintStream(openFileOutput("Words.txt", MODE_PRIVATE | MODE_APPEND));
            printStream.println(etCountry.getText().toString() + "->" + etCapital.getText().toString());
            Toast.makeText(this, "Saved to" +getFilesDir(), Toast.LENGTH_LONG).show();
        }
        catch (IOException e){
            Log.d("Dictionary App", "Error: " +e.toString());
            e.printStackTrace();
        }
    }
}
