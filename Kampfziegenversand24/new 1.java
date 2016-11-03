class Gericht{
	private String Gericht;
	int ingredientAmount;
	String[] ingredients;
	String description;
	
	public Gericht(String Gericht, String ingredient1, String ingredient2, String ingredient3, String ingredient4)	{
		this.Gericht = Gericht;
		this.ingredients[0] = ingredient1;
		this.ingredients[1] = ingredient2;
		this.ingredients[2] = ingredient3;
		this.ingredients[3] = ingredient4;
		
	}
	
	newIngredient(String ingredient;)	{
		ingredients[ingredients.length()] = ingredient;
		
	}
	
	setDescription(String description)	{
		this.description = description;
	}
	
	public String getDescription()	{
		return description;
	}
	public String getGericht()	{
		return Gericht;
	}    
	public String getIngrdient(int ingredientindex)	{
		return ingredients[ingredientindex];
	}
}