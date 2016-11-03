package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OutputActivity extends AppCompatActivity {
    Init rpdb = new Init(); //recipedatabse
    String cingr[];

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] listViewData = {} ; //in diese Liste kommen die möglichen Rezepte


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);


        Intent intent = getIntent();
        cingr[0] = intent.getStringExtra(inputOne);
        cingr[1] = intent.getStringExtra(inputTwo);
        cingr[2] = intent.getStringExtra(inputThree);
        cingr[3] = intent.getStringExtra(inputFour);
        cingr[4] = intent.getStringExtra(inputFive);
        cingr[5] = intent.getStringExtra(inputSix);
        cingr[6] = intent.getStringExtra(inputSeven);
        cingr[7] = intent.getStringExtra(inputEight);

        listView = (ListView) findViewById(R.id.outputListView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewData);
        listView.setAdapter(adapter);


    }



    public boolean testrecipe(int id)   {
        if(((rpdb.gericht.get(id).getIngredient(0) == cingr[0] || rpdb.gericht.get(id).getIngredient(0) == cingr[1] || rpdb.gericht.get(id).getIngredient(0) == cingr[2] || rpdb.gericht.get(id).getIngredient(0) == cingr[3] ) && (rpdb.gericht.get(id).getIngredient(1) == cingr[0] || rpdb.gericht.get(id).getIngredient(1) == cingr[1] || rpdb.gericht.get(id).getIngredient(2) == cingr[2] || rpdb.gericht.get(id).getIngredient(1) == cingr[3]) && (rpdb.gericht.get(id).getIngredient(2) == cingr[0] || rpdb.gericht.get(id).getIngredient(2) ==cingr[1] || rpdb.gericht.get(id).getIngredient(2) == cingr[3]) && (rpdb.gericht.get(id).getIngredient(3) == cingr[0] || rpdb.gericht.get(id).getIngredient(3) == cingr[1] || rpdb.gericht.get(id).getIngredient(3) == cingr[2] || rpdb.gericht.get(id).getIngredient(3) == cingr[3])))   {
            return true;
        }
        else    {
            return false;
        }
    }
}
