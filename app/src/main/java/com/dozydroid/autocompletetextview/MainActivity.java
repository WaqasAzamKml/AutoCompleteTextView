package com.dozydroid.autocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] students = {"Muneeb", "Mujahid", "Waqas", "Haseeb", "Hassan", "Kamran"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,students);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoTextView);
        autoCompleteTextView.setAdapter(arrayAdapter);

        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoTextView);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
