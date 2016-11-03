package com.saentis.project.projectsntis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
    }

    Init rpdb = new Init(); //recipedatabse
    String cingr[];

    public boolean testrecipe(int id)   {
        if(((rpdb.gericht.get(id).getIngredient(0) == cingr[0] || rpdb.gericht.get(id).getIngredient(0) == cingr[1] || rpdb.gericht.get(id).getIngredient(0) == cingr[2] || rpdb.gericht.get(id).getIngredient(0) == cingr[3] ) && (rpdb.gericht.get(id).getIngredient(1) == cingr[0] || rpdb.gericht.get(id).getIngredient(1) == cingr[1] || rpdb.gericht.get(id).getIngredient(2) == cingr[2] || rpdb.gericht.get(id).getIngredient(1) == cingr[3]) && (rpdb.gericht.get(id).getIngredient(2) == cingr[0] || rpdb.gericht.get(id).getIngredient(2) ==cingr[1] || rpdb.gericht.get(id).getIngredient(2) == cingr[3]) && (rpdb.gericht.get(id).getIngredient(3) == cingr[0] || rpdb.gericht.get(id).getIngredient(3) == cingr[1] || rpdb.gericht.get(id).getIngredient(3) == cingr[2] || rpdb.gericht.get(id).getIngredient(3) == cingr[3])))   {
            return true;
        }
        else    {
            return false;
        }
    }
}
