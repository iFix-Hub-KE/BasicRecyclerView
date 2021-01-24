package com.kanyideveloper.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.myRecyclerView);
        addDataSet();
    }

    private void addDataSet(){
        List<Chats> dataSet = DataSet.createChats();
        Log.d(TAG, "addDataSet: "+dataSet.toString());
        adapter = new Adapter(dataSet);
        recyclerView.setAdapter(adapter);
    }
}