package com.geekchtech.android1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_rv);
    }

    public void onBind(Model s) {
        textView.setText(s.getId());
        textView.setText(s.getTitle());
        textView.setText(s.getDescription());
        textView.setText(s.getDate());


    }
}
