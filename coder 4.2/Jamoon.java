class Jamoon{

	String[] name;
	Sweet[] sweet;

	Jamoon(String[] name, Sweet[] sweet){
		this.name = name;
		this.sweet = sweet;
	}

	void display(){
		System.out.println("Executing the display method in Jamoon.");

		if(this.name != null){
			System.out.println("Total number of jamoons: " + this.name.length);
			for(String name : this.name){
				System.out.println("Jamoon name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.sweet != null){
			System.out.println("Total number of sweets: " + this.sweet.length);
			for(Sweet sweets : this.sweet){
				sweets.getSweet();
			}
		}else{
			System.out.println("The sweet is null.");
		}
	}
}