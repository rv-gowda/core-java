class Floor{

	int number;
	String type;

	Floor(int number,String type){
		this.number = number;
		this.type = type;
	}

	void getFloor(){
		System.out.println("Floor number: " + this.number);
		System.out.println("Floor type: " + this.type);
	}
}