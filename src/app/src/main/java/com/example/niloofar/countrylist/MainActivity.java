package com.example.niloofar.countrylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String>countries=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnAdd(View view){

        EditText nameObj=findViewById(R.id.txt_name);
        String name=nameObj.getText().toString();
        countries.add(name);
        nameObj.setText("");

    }
    public void btnGet(View view){
        for (String tmp: countries) {
            Log.i("CL:", tmp);
        }
    }
}
