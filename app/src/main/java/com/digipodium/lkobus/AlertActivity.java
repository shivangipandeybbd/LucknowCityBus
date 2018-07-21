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

public class AlertActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        List<String> categories=new ArrayList<String>();
        categories.add("12");
        categories.add("12A");
        categories.add("23A");
        categories.add("23");
        categories.add("11");
        categories.add("11A");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.display_spinner,categories);
         adapter.setDropDownViewResource(R.layout.display_spinner);

        spinner.setAdapter(adapter);

    }
   public void mChange(View v)
   {
       MyTimePicker mt=new MyTimePicker();
       mt.show(getFragmentManager(),"okk");
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
