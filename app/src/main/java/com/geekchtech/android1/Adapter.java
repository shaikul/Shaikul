package com.geekchtech.android1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<MyViewHolder> {
     private ArrayList<Model>data = new ArrayList<>();
     void setData(ArrayList<Model> data){
          this.data = data;
          notifyDataSetChanged();
     }
     @NonNull
     @Override
     public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,parent,false);
          return new MyViewHolder(view);
     }

     @Override
     public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
          holder.onBind(data.get(position));

     }

     @Override
     public int getItemCount() {
          return data.size();
     }


}
