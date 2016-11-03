package com.saentis.project.projectsntis;

import java.util.ArrayList;

/**
 * Created by Thomas Koscheck on 03.11.2016.
 */


public class Init {

    ArrayList<Gericht> gericht = new ArrayList<>();
    Gericht gerichte;

    public Init()
    {
       gerichte = new Gericht("Kartoffelpfanne", "Kartoffeln", "Zwiebeln", "Tomaten", "Käse");
        gericht.add(gerichte);
    }
}
