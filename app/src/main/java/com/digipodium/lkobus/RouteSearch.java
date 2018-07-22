package com.digipodium.lkobus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;


public class RouteSearch extends AppCompatActivity {
    EditText search_route;
    Button btn_go;
    RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_search);
        search_route=findViewById(R.id.search_route);
        btn_go=findViewById(R.id.btn_go);
        list=findViewById(R.id.list);
    }
}
