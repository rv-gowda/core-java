class Tollgate{
	String name;
	String location;
	String type;
	String operator;
	boolean active;
	int fee;

	Tollgate(String name,String location,String type,String operator,boolean active,int fee){
		this.name=name;
		this.location=location;
		this.type=type;
		this.operator=operator;
		this.active=active;
		this.fee=fee;
	}

	void tollgateInfo(){
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
		System.out.println("Type:"+this.type);
		System.out.println("Operator:"+this.operator);
		System.out.println("Is Active:"+this.active);
		System.out.println("Fee:"+this.fee);
	}
}