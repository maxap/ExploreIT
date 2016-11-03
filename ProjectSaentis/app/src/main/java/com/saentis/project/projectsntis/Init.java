package com.saentis.project.projectsntis;

import android.content.Context;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Thomas Koscheck on 03.11.2016.
 */


public class Init extends RealmObject {

    @PrimaryKey
    private long id;
    private String name;
    private RealmList<Gericht> realmGericht;


    ArrayList<Gericht> gerichtliste = new ArrayList<>();


    public Init(Context context) {

        Gericht gericht = new Gericht();
        gericht = new Gericht("Kartoffelpfanne", "Kartoffeln", "Zwiebeln", "Tomaten", "Käse");
        gerichtliste.add(gericht);

        gericht = new Gericht("Überbackene After-Work-Gnocchi", "Gnocchi", "Schlagsahne", "Milch", "Gouda");
        gerichtliste.add(gericht);

        gericht = new Gericht("Rucola-Lemon-Spaghetti", "Rucola", "Zitrone", "Nudeln", "Knoblauch");
        gerichtliste.add(gericht);

        gericht = new Gericht("Eier-Speck-Nudelpfanne", "Nudeln", "Speck", "Eier", "Butter");
        gerichtliste.add(gericht);

        gericht = new Gericht("Brotpudding", "Puddingpulver", "Schokolade", "Kekse", "Milch");
        gerichtliste.add(gericht);

        gericht = new Gericht("Paprikatopf mit Hackfleisch", "Champingnons", "Paprika", "Hackfleisch", "Tomaten");
        gerichtliste.add(gericht);

        /*
        gericht.setName("Kartoffelpfanne");
        gericht.newIngredient("Zwiebeln");
        gericht.newIngredient("Tomaten");
        gericht.newIngredient("Käse");
        gericht.newIngredient("Kartoffeln");
        gerichtliste.add(gericht);

        gericht.setName("Kartoffelpfanne");
        gericht.newIngredient("Zwiebeln");
        gericht.newIngredient("Tomaten");
        gericht.newIngredient("Käse");
        gericht.newIngredient("Kartoffeln");
        gerichtliste.add(gericht);*/


        Realm myRealm = Realm.getInstance(context);

        myRealm.beginTransaction();
        myRealm.copyToRealmOrUpdate(gerichtliste);

        myRealm.commitTransaction();
    }
}




