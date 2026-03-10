class CarrotHalwaRunner{

	public static void main(String[] args){

		String[] name = {"ClassicHalwa","MilkHalwa","DryFruitHalwa","GheeHalwa","SweetHalwa"};

		Ingredient ingredient1 = new Ingredient("Carrot",2.5);
		Ingredient ingredient2 = new Ingredient("Milk",1.5);
		Ingredient ingredient3 = new Ingredient("Sugar",0.8);

		Ingredient[] ingredient = new Ingredient[3];
		ingredient[0] = ingredient1;
		ingredient[1] = ingredient2;
		ingredient[2] = ingredient3;

		CarrotHalwa halwa = new CarrotHalwa(name, ingredient);
		halwa.display();
	}
}