package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class AddIngredient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredient);
        Intent intent = getIntent();

        autoCompleteTextViewAdd1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
    }

    public void beenden (View view)
    {
        finish();
    }

    public void speichern(View view)
    {
        SelectionActivity.zutaten.add();
    }
}
