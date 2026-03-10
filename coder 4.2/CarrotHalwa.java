class CarrotHalwa{

	String[] name;
	Ingredient[] ingredient;

	CarrotHalwa(String[] name, Ingredient[] ingredient){
		this.name = name;
		this.ingredient = ingredient;
	}

	void display(){
		System.out.println("Executing the display method in CarrotHalwa.");

		if(this.name != null){
			System.out.println("Total number of halwa types: " + this.name.length);
			for(String name : this.name){
				System.out.println("Halwa name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.ingredient != null){
			System.out.println("Total number of ingredients: " + this.ingredient.length);
			for(Ingredient ingredients : this.ingredient){
				ingredients.getIngredient();
			}
		}else{
			System.out.println("The ingredient is null.");
		}
	}
}