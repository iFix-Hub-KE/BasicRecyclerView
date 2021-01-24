
package com.kanyideveloper.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<Chats> myList;

    public Adapter(List<Chats> myList) {
        this.myList = myList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chats_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(myList.get(position).getChatTitle());
        holder.message.setText(myList.get(position).getMessage());
        holder.pic.setImageResource(myList.get(position).getChatsImage());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView pic;
        TextView title;
        TextView message;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pic = itemView.findViewById(R.id.picture);
            title = itemView.findViewById(R.id.textViewTitle);
            message = itemView.findViewById(R.id.textViewMessage);
        }
    }

}






































/*
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<Elephant> list;

    public Adapter(List<Elephant> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            final Elephants elephants = list.get(position);
           holder.textView.setText(elephants.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.fgndkog);
        }
    }

}
*/
