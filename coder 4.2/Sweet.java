class Sweet{

	String flavor;
	double price;

	Sweet(String flavor,double price){
		this.flavor = flavor;
		this.price = price;
	}

	void getSweet(){
		System.out.println("Sweet flavor: " + this.flavor);
		System.out.println("Sweet price: " + this.price);
	}
}