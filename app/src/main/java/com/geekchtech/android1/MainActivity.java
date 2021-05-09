package com.geekchtech.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_bottom);
        String text = "Забыл пароль? Нажми сюда";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan fcsOrange = new ForegroundColorSpan(Color.YELLOW);
        ss.setSpan(fcsOrange,14,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);

    }

    public void click(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}