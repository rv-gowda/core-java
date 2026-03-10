class Paint{

	String color;
	double price;

	Paint(String color,double price){
		this.color = color;
		this.price = price;
	}

	void getPaint(){
		System.out.println("Paint color: " + this.color);
		System.out.println("Paint price: " + this.price);
	}
}