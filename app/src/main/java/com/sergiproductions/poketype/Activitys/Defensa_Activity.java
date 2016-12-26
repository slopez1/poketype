package com.sergiproductions.poketype.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.sergiproductions.poketype.R;
import com.sergiproductions.poketype.ServiceInfo;

public class Defensa_Activity extends AppCompatActivity {
    ServiceInfo service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defensa_);
        service = new ServiceInfo();
        Spinner type1 = (Spinner) findViewById(R.id.type1);
        Spinner type2 = (Spinner) findViewById(R.id.type2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        type1.setAdapter(adapter);
        type2.setAdapter(adapter);
    }



    public void calcTypes(View view) {
        Spinner type1 = (Spinner) findViewById(R.id.type1);
        Spinner type2 = (Spinner) findViewById(R.id.type2);
        EditText Sx4 = (EditText) findViewById(R.id.Sx4);
        EditText Sx2 = (EditText) findViewById(R.id.Sx2);
        EditText Sx05 = (EditText) findViewById(R.id.Sx05);
        EditText Sx0 = (EditText) findViewById(R.id.Sx0);
        service.setTable(type1.getSelectedItem().toString(),type2.getSelectedItem().toString());
        Sx4.setText(service.getSSDef().toString());
        Sx2.setText(service.getSDef().toString());
        Sx05.setText(service.getLDef().toString());
        Sx0.setText(service.get0Def().toString());
    }

}
