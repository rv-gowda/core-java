class Sambar{
	String type;
	String mainIngredient;
	String spiceLevel;
	boolean vegetarian;
	boolean hot;
	int quantity;

	Sambar(String type,String mainIngredient,String spiceLevel,boolean vegetarian,boolean hot,int quantity){
		this.type=type;
		this.mainIngredient=mainIngredient;
		this.spiceLevel=spiceLevel;
		this.vegetarian=vegetarian;
		this.hot=hot;
		this.quantity=quantity;
	}

	void sambarInfo(){
		System.out.println("Type:"+this.type);
		System.out.println("Main Ingredient:"+this.mainIngredient);
		System.out.println("Spice Level:"+this.spiceLevel);
		System.out.println("Vegetarian:"+this.vegetarian);
		System.out.println("Hot:"+this.hot);
		System.out.println("Quantity:"+this.quantity);
	}
}