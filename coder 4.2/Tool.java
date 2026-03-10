class Tool{

	String toolName;
	double price;

	Tool(String toolName,double price){
		this.toolName = toolName;
		this.price = price;
	}

	void getTool(){
		System.out.println("Tool name: " + this.toolName);
		System.out.println("Tool price: " + this.price);
	}
}