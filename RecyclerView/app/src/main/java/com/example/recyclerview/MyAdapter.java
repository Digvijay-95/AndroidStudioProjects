package com.example.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.Objects;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1[];
    Context context;

    public MyAdapter(Context ct, String s1[]){
        context = ct;
        data1=s1;
    }

    @android.support.annotation.NonNull
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@android.support.annotation.NonNull @NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@android.support.annotation.NonNull @NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(@NonNull View itemView){
            super(Objects.requireNonNull(itemView));
        }
    }
}
