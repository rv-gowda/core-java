class Ink{

	String color;
	double price;

	Ink(String color, double price){
		this.color = color;
		this.price = price;
	}

	void getInk(){
		System.out.println("Ink Color: " + this.color);
		System.out.println("Ink Price: " + this.price);
	}
}