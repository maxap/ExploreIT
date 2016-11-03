package com.saentis.project.projectsntis;

import java.util.ArrayList;

/**
 * Created by Thomas Koscheck on 03.11.2016.
 */


public class Init {

    ArrayList<Gericht> gericht = new ArrayList<>();
    Gericht gerichte;

    public Init() {
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
    }
}
