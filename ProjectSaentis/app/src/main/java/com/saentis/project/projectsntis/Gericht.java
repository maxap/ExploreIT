package com.saentis.project.projectsntis;


import java.io.Serializable;

class Gericht  implements Serializable{

    private String Gericht;
    int ingredientAmount;
    String[] ingredients;
    String description;
//test
    public Gericht(String Gericht, String ingredient1, String ingredient2, String ingredient3, String ingredient4)	{
        this.Gericht = Gericht;
        this.ingredients[0] = ingredient1;
        this.ingredients[1] = ingredient2;
        this.ingredients[2] = ingredient3;
        this.ingredients[3] = ingredient4;

    }

    public void newIngredient(String ingredient)	{
        ingredients[ingredients.length == 0 ? ingredients.length : 0] = ingredient;

    }

    public void setDescription(String description)	{
        this.description = description;
    }

    public String getDescription()	{
        return description;
    }

    public String getGericht()	{
        return Gericht;
    }
<<<<<<< HEAD
    public String getIngredient(int ingredientindex)	{
=======

    public String getIngrdient(int ingredientindex)	{
>>>>>>> origin/master
        return ingredients[ingredientindex];
    }
}