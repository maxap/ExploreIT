package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class SelectionActivity extends AppCompatActivity {
    EditText ioOne, ioTwo, ioThree, ioFour;
    AutoCompleteTextView autoCompleteTextView1, autoCompleteTextView2, autoCompleteTextView3, autoCompleteTextView4;
    String [] Ingredients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

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
        ioOne = (EditText) findViewById(R.id.autoCompleteTextView1);
        ioTwo = (EditText) findViewById(R.id.autoCompleteTextView2);
        ioThree = (EditText) findViewById(R.id.autoCompleteTextView3);
        ioFour = (EditText) findViewById(R.id.autoCompleteTextView4);

    }

    public static final String INPUT_INGREDIENT1 = "ProjectSaentis.INPUT_INGREDIENT1";
    public static final String INPUT_INGREDIENT2 = "ProjectSaentis.INPUT_INGREDIENT2";
    public static final String INPUT_INGREDIENT3 = "ProjectSaentis.INPUT_INGREDIENT3";
    public static final String INPUT_INGREDIENT4 = "ProjectSaentis.INPUT_INGREDIENT4";
    public static final String INPUT_INGREDIENT5 = "ProjectSaentis.INPUT_INGREDIENT1";
    public static final String INPUT_INGREDIENT6 = "ProjectSaentis.INPUT_INGREDIENT2";
    public static final String INPUT_INGREDIENT7 = "ProjectSaentis.INPUT_INGREDIENT3";
    public static final String INPUT_INGREDIENT8 = "ProjectSaentis.INPUT_INGREDIENT4";

    String input

    public void goToOutput(View view)  {
        Intent intent = new Intent(this, OutputActivity.class);
        inputOne = ioOne.getText().toString();
        inputTwo = ioTwo.getText().toString();
        inputThree = ioThree.getText().toString();
        inputFour = ioFour.getText().toString();
        intent.putExtra(INPUT_INGREDIENT1, inputOne);
        intent.putExtra(INPUT_INGREDIENT2, inputTwo);               // theoretisch: in for-Scheife packen, INGREDIENT durch i ersetzen, mmittels i.toString()  sollte doch funktionieren?!
        intent.putExtra(INPUT_INGREDIENT3, inputThree);        intent.putExtra(INPUT_INGREDIENT4, inputFour);
        intent.putExtra(INPUT_INGREDIENT5, inputFive);
        intent.putExtra(INPUT_INGREDIENT6, inputSix);               // theoretisch: in for-Scheife packen, INGREDIENT durch i ersetzen, mmittels i.toString()  sollte doch funktionieren?!

        intent.putExtra(INPUT_INGREDIENT7, inputSeven);
        intent.putExtra(INPUT_INGREDIENT8, inputEight);
        startActivity(intent);
    }
}
