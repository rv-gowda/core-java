class Cloth{
	String type;
	String color;
	String brand;
	boolean washable;
	boolean branded;
	int size;

	Cloth(String type,String color,String brand,boolean washable,boolean branded,int size){
		this.type=type;
		this.color=color;
		this.brand=brand;
		this.washable=washable;
		this.branded=branded;
		this.size=size;
	}

	void clothInfo(){
		System.out.println("Type:"+this.type);
		System.out.println("Color:"+this.color);
		System.out.println("Brand:"+this.brand);
		System.out.println("Washable:"+this.washable);
		System.out.println("Branded:"+this.branded);
		System.out.println("Size:"+this.size);
	}
}