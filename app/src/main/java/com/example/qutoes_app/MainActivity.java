package com.example.qutoes_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvlist;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvlist = findViewById(R.id.rcvlist);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(MainActivity.this LinearLayoutManager.VERTICAL,false);
        Utils utils;
        Qutoes_listAdapter adapter = new Qutoes_listAdapter(utils.quotes.length);
        
        rcvlist.setLayoutManager(manager);
        rcvlist.setAdapter(adapter);
    }
}

    }
}