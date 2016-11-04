package com.saentis.project.projectsntis;

import io.realm.RealmObject;

/**
 * Created by Thomas Koscheck on 04.11.2016.
 */

public class Zutat extends RealmObject {
    String zutaten;

    public Zutat(String zutat) {
        this.zutaten = zutat;
    }

    public Zutat() {
    }
}




