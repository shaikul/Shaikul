package com.geekchtech.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
        initListeners();
    }
    private void initView(){
        editText = findViewById(R.id.number_edit);
        button = findViewById(R.id.btn2);
    }
    private void initListeners(){
        button.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("number", editText.getText().toString());
            setResult(RESULT_OK,intent);
            finish();
        });
    }
}