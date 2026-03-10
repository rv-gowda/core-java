class Server{

	String[] name;
	Port[] port;

	Server(String[] name, Port[] port){
		this.name = name;
		this.port = port;
	}

	void display(){
		System.out.println("Executing the display method in Server.");

		if(this.name != null){
			System.out.println("Total number of servers: " + this.name.length);
			for(String name : this.name){
				System.out.println("Server name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.port != null){
			System.out.println("Total number of ports: " + this.port.length);
			for(Port ports : this.port){
				ports.getPort();
			}
		}else{
			System.out.println("The port is null.");
		}
	}
}