class Metal{

	String type;
	double weight;

	Metal(String type,double weight){
		this.type = type;
		this.weight = weight;
	}

	void getMetal(){
		System.out.println("Metal type: " + this.type);
		System.out.println("Metal weight: " + this.weight);
	}
}