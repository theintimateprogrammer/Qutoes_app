package com.example.qutoes_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Qutoes_listAdapter extends RecyclerView.Adapter<Qutoes_listAdapter.Qutoes_listHolder> {


    @NonNull
    @Override
    public Qutoes_listHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.qutoes_item,parent,false);
        return new Qutoes_listHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Qutoes_listHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class Qutoes_listHolder extends RecyclerView.ViewHolder {
        public Qutoes_listHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
