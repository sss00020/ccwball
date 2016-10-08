package com.example.tontan.roruea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class UserAreaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final TextView welcome = (TextView) findViewById(R.id.txtwelcome);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Button bttomap = (Button) findViewById(R.id.bttomap);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String message = "welcome : " + name ;
        welcome.setText(message);
        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<>();
        categories.add("เรือด่วนธงส้ม(Orange)");
        categories.add("เรือด่วนธงเหลือง(Yellow)");
        categories.add("เรือด่วนธงเขียว(Green)");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);


        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(dataAdapter);

        bttomap.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent mapuserIntent = new Intent(UserAreaActivity.this,MapUserActivity.class);
                UserAreaActivity.this.startActivity(mapuserIntent);
            }
        });
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getItemAtPosition(position).toString();

        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


}
