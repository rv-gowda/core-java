class Printer{

	String[] brand;
	Ink[] ink;

	Printer(String[] brand, Ink[] ink){
		this.brand = brand;
		this.ink = ink;
	}

	void display(){
		System.out.println("Executing display method in Printer");

		if(this.brand != null){
			System.out.println("Total number of brands: " + this.brand.length);
			for(String brand : this.brand){
				System.out.println("Printer brand: " + brand);
			}
		}else{
			System.out.println("Brand is null");
		}

		if(this.ink != null){
			System.out.println("Total number of inks: " + this.ink.length);
			for(Ink inks : this.ink){
				inks.getInk();
			}
		}else{
			System.out.println("Ink is null");
		}
	}
}