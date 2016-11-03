package com.saentis.project.projectsntis;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Thomas Koscheck on 03.11.2016.
 */


public class Init extends RealmObject {

    @PrimaryKey
    private long id;
    private String name;
    private RealmList<Gericht> realmGericht;


    //ArrayList<Gericht> gericht = new ArrayList<>();
    //Gericht gerichte;

    public Init() {
        Gericht gericht = new Gericht;
        ("Kartoffelpfanne", "Kartoffeln", "Zwiebeln", "Tomaten", "Käse");
        realmGericht

        gerichte = new Gericht("Kartoffelpfanne", "Kartoffeln", "Zwiebeln", "Tomaten", "Käse");
        gericht.add(gerichte);

        gerichte = new Gericht("Überbackene After-Work-Gnocchi", "Gnocchi", "Schlagsahne", "Milch", "Gouda");
        gericht.add(gerichte);

        gerichte = new Gericht("Rucola-Lemon-Spaghetti", "Rucola", "Zitrone", "Nudeln", "Knoblauch");
        gericht.add(gerichte);

        gerichte = new Gericht("Eier-Speck-Nudelpfanne", "Nudeln", "Speck", "Eier", "Butter");
        gericht.add(gerichte);

        gerichte = new Gericht("Brotpudding", "Puddingpulver", "Schokolade", "Kekse", "Milch");
        gericht.add(gerichte);

        gerichte = new Gericht("Paprikatopf mit Hackfleisch", "Champingnons", "Paprika", "Hackfleisch", "Tomaten");
        gericht.add(gerichte);

        // Initialize Realm
        Realm.init(context);
    }

    public
}




