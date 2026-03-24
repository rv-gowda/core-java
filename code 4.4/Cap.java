class Cap{
	String brand;
	String color;
	double price;
	String size;
	boolean adjustable;
	String material;

	Cap(String brand,String color,double price,String size,boolean adjustable,String material){
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.size=size;
		this.adjustable=adjustable;
		this.material=material;
	}

	void capInfo(){
		System.out.println("Brand:"+this.brand);
		System.out.println("Color:"+this.color);
		System.out.println("Price:"+this.price);
		System.out.println("Size:"+this.size);
		System.out.println("Adjustable:"+this.adjustable);
		System.out.println("Material:"+this.material);
	}
}