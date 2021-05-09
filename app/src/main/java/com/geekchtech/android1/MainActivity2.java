package com.geekchtech.android1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    FrameLayout pervyi_kvadrat, vtoroi_kvadrat,tretiy_kvadrat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.numbers);
        pervyi_kvadrat = findViewById(R.id.pervyi_kvadrat);
        vtoroi_kvadrat = findViewById(R.id.vtoroi_kvadrat);
        vtoroi_kvadrat = findViewById(R.id.tretiy_kvadrat);

        pervyi_kvadrat.setOnClickListener(v -> {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(intent);

        });
        vtoroi_kvadrat.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
            startActivityForResult(intent, 2);

        });
        tretiy_kvadrat.setOnClickListener(v -> {
            String escapedQuery = null;
            try {
                escapedQuery = URLEncoder.encode("Android", "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Uri uri = Uri.parse("http://www.google.com/#q=" + escapedQuery);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);


        });
    }

    public void click(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivityForResult(intent, 1);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == RESULT_OK && data!= null ){
            textView.setText(data.getStringExtra("number"));
        }
        if (requestCode == 2 && resultCode == RESULT_OK && data!= null ){
            Uri contactData = data.getData();
            Cursor c =  managedQuery(contactData, null, null, null, null);
            if (c.moveToFirst()) {
                String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER));
                Log.e("", "onActivityResult: "+name);

            }

        }
    }
}