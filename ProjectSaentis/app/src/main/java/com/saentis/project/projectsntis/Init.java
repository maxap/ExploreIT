package com.saentis.project.projectsntis;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collection;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Thomas Koscheck on 03.11.2016.
 */


public class Init {

    ArrayList<Gericht> gerichtliste = new ArrayList<>();
    Gericht gericht;

    ArrayList<String>zutaten =  new ArrayList<>();


    public Init(Context context) {
        gericht = new Gericht("Kartoffelpfanne", "Kartoffeln", "Zwiebeln", "Tomaten", "Käse");
        gerichtliste.add(gericht);

        gericht = new Gericht("Überbackene After-Work-Gnocchi", "Gnocchi", "Schlagsahne", "Milch", "Käse");
        gerichtliste.add(gericht);

        gericht = new Gericht("Rucola-Lemon-Spaghetti", "Rucola", "Zitrone", "Nudeln", "Knoblauch");
        gerichtliste.add(gericht);

        gericht = new Gericht("Eier-Speck-Nudelpfanne", "Nudeln", "Speck", "Eier", "Butter");
        gerichtliste.add(gericht);

        gericht = new Gericht("Brotpudding", "Puddingpulver", "Schokolade", "Kekse", "Milch");
        gerichtliste.add(gericht);

        gericht = new Gericht("Paprikatopf mit Hackfleisch", "Champingnons", "Paprika", "Hackfleisch", "Tomaten");
        gerichtliste.add(gericht);

        Realm myRealm = Realm.getDefaultInstance();

        myRealm.beginTransaction();
        myRealm.copyToRealmOrUpdate(gerichtliste);

        myRealm.commitTransaction();
    }
}




