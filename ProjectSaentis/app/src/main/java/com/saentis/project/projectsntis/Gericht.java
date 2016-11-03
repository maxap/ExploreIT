package com.saentis.project.projectsntis;


import java.io.Serializable;

import io.realm.RealmObject;


class Gericht extends RealmObject implements Serializable {

    private String Gericht;
    private int ingredientAmount;
    private String[] ingredients;
    private String description;

public Gericht(String Gericht, String ingredient1, String ingredient2, String ingredient3, String ingredient4) {
    this.Gericht = Gericht;
    this.ingredients[0] = ingredient1;
    this.ingredients[1] = ingredient2;
    this.ingredients[2] = ingredient3;
    this.ingredients[3] = ingredient4;
}
//test
    public Gericht(String name, String... ing)	{
        for(int i = 0; ing.length>i;i++)    {

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