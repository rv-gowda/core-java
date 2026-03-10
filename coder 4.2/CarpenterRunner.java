class CarpenterRunner{

	public static void main(String[] args){

		String[] name = {"Ramesh","Suresh","Mahesh","Kiran","Arjun"};

		Tool tool1 = new Tool("Hammer",250);
		Tool tool2 = new Tool("Saw",300);
		Tool tool3 = new Tool("Drill",450);

		Tool[] tool = new Tool[3];
		tool[0] = tool1;
		tool[1] = tool2;
		tool[2] = tool3;

		Carpenter carpenter = new Carpenter(name, tool);
		carpenter.display();
	}
}