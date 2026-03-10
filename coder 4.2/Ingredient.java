class Ingredient{

	String item;
	double quantity;

	Ingredient(String item,double quantity){
		this.item = item;
		this.quantity = quantity;
	}

	void getIngredient(){
		System.out.println("Ingredient name: " + this.item);
		System.out.println("Ingredient quantity: " + this.quantity);
	}
}