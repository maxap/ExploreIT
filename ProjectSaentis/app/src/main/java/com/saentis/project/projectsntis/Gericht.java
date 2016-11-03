package com.saentis.project.projectsntis;

import java.io.Serializable;
import io.realm.RealmObject;


class Gericht extends RealmObject {

    private String Gericht;
    //private int ingredientAmount;
    private String[] ingredients ={};
    private String description;

    public Gericht() {
    }

    public Gericht(String name, String... ing) {
        this.Gericht = name;
        for (int i = 0; ing.length > i; i++) {
            ingredients[i] = ing[i];
        }
    }

    public void newIngredient(String ingredient) {
        ingredients[ingredients.length == 0 ? ingredients.length : 0] = ingredient;
    }

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
        return ingredients[ingredientindex];
    }
}