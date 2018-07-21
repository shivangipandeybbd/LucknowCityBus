package com.digipodium.lkobus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FareDetails extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
 Spinner source,destination;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare_details);
        source=findViewById(R.id.sourcePlaces);
        destination=findViewById(R.id.destinationPlaces);
        source.setOnItemSelectedListener(this);
        List<String> categories=new ArrayList<String>();
        categories.add("Hazratganj");
        categories.add("Polytechnic");
        categories.add("Charbagh");
        categories.add("Golmarket");
        categories.add("Khurram Nagar");
        categories.add("Rajajipuram");
        categories.add("Kamta");
        categories.add("Barabanki");
        categories.add("Munsipulia");
        categories.add("Chinhat");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.display_spinner,categories);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,R.layout.display_spinner,categories);
        adapter.setDropDownViewResource(R.layout.display_spinner);

        source.setAdapter(adapter);
       destination.setAdapter(adapter1);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
     String item=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), ""+item, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
