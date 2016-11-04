package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class AddIngredient extends AppCompatActivity {

    EditText editTextAddZutat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredient);
        Intent intent = getIntent();

        editTextAddZutat = (EditText) findViewById(R.id.editTextAddZutat);
    }

    public void beenden(View view) {
        finish();
    }

    public void speichern(View view) {
       // SelectionActivity.zutaten.add(editTextAddZutat.getText().toString());

        finish();
    }
}
