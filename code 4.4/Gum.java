class Gum{
	String brand;
	String flavor;
	String color;
	boolean sugarFree;
	boolean soft;
	int quantity;

	Gum(String brand,String flavor,String color,boolean sugarFree,boolean soft,int quantity){
		this.brand=brand;
		this.flavor=flavor;
		this.color=color;
		this.sugarFree=sugarFree;
		this.soft=soft;
		this.quantity=quantity;
	}

	void gumInfo(){
		System.out.println("Brand:"+this.brand);
		System.out.println("Flavor:"+this.flavor);
		System.out.println("Color:"+this.color);
		System.out.println("Sugar Free:"+this.sugarFree);
		System.out.println("Soft:"+this.soft);
		System.out.println("Quantity:"+this.quantity);
	}
}