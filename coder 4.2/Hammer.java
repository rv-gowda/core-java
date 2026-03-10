class Hammer{

	String[] name;
	Metal[] metal;

	Hammer(String[] name, Metal[] metal){
		this.name = name;
		this.metal = metal;
	}

	void display(){
		System.out.println("Executing the display method in Hammer.");

		if(this.name != null){
			System.out.println("Total number of hammers: " + this.name.length);
			for(String name : this.name){
				System.out.println("Hammer name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.metal != null){
			System.out.println("Total number of metals: " + this.metal.length);
			for(Metal metals : this.metal){
				metals.getMetal();
			}
		}else{
			System.out.println("The metal is null.");
		}
	}
}