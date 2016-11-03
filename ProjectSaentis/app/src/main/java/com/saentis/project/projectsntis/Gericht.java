package com.saentis.project.projectsntis;

import java.io.Serializable;
import io.realm.RealmObject;


public class Gericht extends RealmObject {

    private String Gericht;
    //private int ingredientAmount;
    //private String[] ingredients ={};
    private String description;
    private String ingredient1, ingredient2, ingredient3, ingredient4, ingredient5, ingredient6, ingredient7, ingredient8;

    public Gericht() {
    }

    public Gericht(String name, String... ing) {
        this.Gericht = name;
        ingredient1 = ing[0];
        ingredient2 = ing[1];
        ingredient3 = ing[2];
        ingredient4 = ing[3];
//        ingredient5 = ing[4];
//        ingredient6 = ing[5];
//        ingredient7 = ing[6];
//        ingredient8 = ing[7];
    }

    /*public void newIngredient(String ingredient) {
        ingredients[ingredients.length == 0 ? ingredients.length : 0] = ingredient;
    }*/

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.Gericht = name;
    }

    public String getGericht() {
        return Gericht;
    }

    public String getIngredient(int ingredientindex) {

        switch (ingredientindex) {
            case 0:
                return ingredient1;

            case 1:
                return ingredient2;

            case 2:
                return ingredient3;

            case 3:
                return ingredient4;

            case 4:
                return ingredient5;

            case 5:
                return ingredient6;

            case 6:
                return ingredient7;

            default:
                return ingredient8;
        }
    }
}
