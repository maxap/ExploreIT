package com.saentis.project.projectsntis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.internal.Context;
import io.realm.internal.async.QueryUpdateTask;

public class AddIngredient extends AppCompatActivity {

    ArrayList<Zutat> zutatliste = new ArrayList<>();
    Zutat zutat;

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

        zutat = new Zutat(editTextAddZutat.getText().toString());
        zutatliste.add(zutat);

        RealmConfiguration config = new RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().build();
        final Realm myRealmZutat = Realm.getInstance(config);

        //Realm myRealmZutat= Realm.getDefaultInstance();

        myRealmZutat.beginTransaction();
        //myRealmZutat.copyToRealmOrUpdate(zutatliste);
        myRealmZutat.commitTransaction();

        Toast.makeText(this, "Zutat wurde gespeichert", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, SelectionActivity.class);
        startActivity(intent);
    }
}
