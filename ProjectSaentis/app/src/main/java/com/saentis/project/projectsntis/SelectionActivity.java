package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class SelectionActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView1, autoCompleteTextView2, autoCompleteTextView3, autoCompleteTextView4;
    String [] Ingredients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        Intent intent;
        intent = new Intent(this, OutputActivity.class);

        autoCompleteTextView1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        autoCompleteTextView2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        autoCompleteTextView3 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView3);
        autoCompleteTextView4 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView4);
        Ingredients = getResources().getStringArray(R.array.ingredients);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Ingredients);
        autoCompleteTextView1.setAdapter(adapter);
        autoCompleteTextView2.setAdapter(adapter);
        autoCompleteTextView3.setAdapter(adapter);
        autoCompleteTextView4.setAdapter(adapter);
    }

    public void test(View view)
    {
        Toast.makeText(this, autoCompleteTextView1.getText(), Toast.LENGTH_SHORT).show();
    }
}
