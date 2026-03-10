class Deal{

	String type;
	double amount;

	Deal(String type,double amount){
		this.type = type;
		this.amount = amount;
	}

	void getDeal(){
		System.out.println("Deal type: " + this.type);
		System.out.println("Deal amount: " + this.amount);
	}
}