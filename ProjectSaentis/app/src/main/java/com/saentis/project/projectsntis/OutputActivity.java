package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT1;
import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT2;
import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT3;
import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT4;
import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT5;
import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT6;
import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT7;
import static com.saentis.project.projectsntis.SelectionActivity.INPUT_INGREDIENT8;

public class OutputActivity extends AppCompatActivity {
    Init rpdb = new Init(this); //recipedatabase
    String cingr[] = new String[4];     //current ingridient
    int positionIndex[] = new int[20];
    int positionCounter = 0;

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] listViewData = new String[20] ; //in diese Liste kommen die möglichen Rezepte

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        for(int i = 0; i<listViewData.length; i++)  {
            listViewData[i] = "";
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        Intent intent = getIntent();
        cingr[0] = intent.getStringExtra(INPUT_INGREDIENT1);
        cingr[1] = intent.getStringExtra(INPUT_INGREDIENT2);
        cingr[2] = intent.getStringExtra(INPUT_INGREDIENT3);
        cingr[3] = intent.getStringExtra(INPUT_INGREDIENT4);
//        cingr[4] = intent.getStringExtra(INPUT_INGREDIENT5);
//        cingr[5] = intent.getStringExtra(INPUT_INGREDIENT6);
//        cingr[6] = intent.getStringExtra(INPUT_INGREDIENT7);
//        cingr[7] = intent.getStringExtra(INPUT_INGREDIENT8);

        filler();

        listView = (ListView) findViewById(R.id.outputListView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(OutputActivity.this, "Position: "+position, Toast.LENGTH_SHORT).show();  //Ausgabe beim draufdrüchen eines ListenElements
            }
        });
    }

    public void filler()    {
        for(int i = 0; i<rpdb.gerichtliste.size(); i++) {
            if(testrecipe(i))  {
                listViewData[positionCounter] = rpdb.gerichtliste.get(i).getGericht();
                positionIndex[positionCounter] = i;
                positionCounter++;
                System.out.println("true in filler, index: "+i);
            }

        }
        System.out.println("Filler Finished");
    }

    public boolean testrecipe(int id)   {
        boolean outputs[] = new boolean[4];
        for(int i0 = 0; i0<4;i0++) {
            outputs[i0] = false;
        }
        for(int i1 = 0;i1<4;i1++) {
            for(int i2=0; i2<4; i2++)    {
                if(rpdb.gerichtliste.get(id).getIngredient(i1).equals(cingr[i2]))    {
                    System.out.println("Hit, id: "+id);
                    outputs[i2] = true;
                }
            }
        }
        return outputs[0]&&outputs[1]&&outputs[2]&&outputs[3];
    }

    public void Beenden(View view)
    {
        finish();
    }

    public void goToRecipe(View view)
    {
        Intent intent = new Intent(this, AddRecipe.class);
        startActivity(intent);
    }
}
