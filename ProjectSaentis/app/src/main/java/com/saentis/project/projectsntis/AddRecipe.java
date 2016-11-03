package com.saentis.project.projectsntis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;

import io.realm.Realm;
import io.realm.internal.Context;

public class AddRecipe extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextViewAdd1, autoCompleteTextViewAdd2, autoCompleteTextViewAdd3, autoCompleteTextViewAdd4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        autoCompleteTextViewAdd1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        autoCompleteTextViewAdd2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        autoCompleteTextViewAdd3 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView3);
        autoCompleteTextViewAdd4 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView4);
    }

    public void rezepthinzufügen(Context context)
    {
        String ingridient1 = autoCompleteTextViewAdd1.getText().toString();
        String ingridient2 = autoCompleteTextViewAdd2.getText().toString();
        String ingridient3 = autoCompleteTextViewAdd3.getText().toString();
        String ingridient4 = autoCompleteTextViewAdd4.getText().toString();



        gericht = new Gericht("Paprikatopf mit Hackfleisch", "Champingnons", "Paprika", "Hackfleisch", "Tomaten");
        gerichtliste.add(gericht);

        Realm myRealm = Realm.getDefaultInstance();

        myRealm.beginTransaction();
        myRealm.copyToRealmOrUpdate(gerichtliste);

        myRealm.commitTransaction();
    }

    public void beenden(View view)
    {
        finish();
    }
}
