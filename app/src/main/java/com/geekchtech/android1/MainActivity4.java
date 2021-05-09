package com.geekchtech.android1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    RecyclerView rv;
    Adapter adapter;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initRec();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");

    }

    private void initRec(){
        rv =  findViewById(R.id.recycler);
        adapter = new Adapter();
        rv.setAdapter(adapter);
        adapter.setData(list);
    }
}