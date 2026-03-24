class Statue{
	String name;
	String material;
	String location;
	String artist;
	boolean historical;
	int height;

	Statue(String name,String material,String location,String artist,boolean historical,int height){
		this.name=name;
		this.material=material;
		this.location=location;
		this.artist=artist;
		this.historical=historical;
		this.height=height;
	}

	void statueInfo(){
		System.out.println("Name:"+this.name);
		System.out.println("Material:"+this.material);
		System.out.println("Location:"+this.location);
		System.out.println("Artist:"+this.artist);
		System.out.println("Is Historical:"+this.historical);
		System.out.println("Height:"+this.height);
	}
}