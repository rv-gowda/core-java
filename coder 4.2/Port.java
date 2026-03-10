class Port{

	int portNumber;
	String type;

	Port(int portNumber,String type){
		this.portNumber = portNumber;
		this.type = type;
	}

	void getPort(){
		System.out.println("Port number: " + this.portNumber);
		System.out.println("Port type: " + this.type);
	}
}