class ServerRunner{

	public static void main(String[] args){

		String[] name = {"Apache","Nginx","Tomcat","IIS","NodeServer"};

		Port port1 = new Port(8080,"HTTP");
		Port port2 = new Port(443,"HTTPS");
		Port port3 = new Port(21,"FTP");

		Port[] port = new Port[3];
		port[0] = port1;
		port[1] = port2;
		port[2] = port3;

		Server server = new Server(name, port);
		server.display();
	}
}