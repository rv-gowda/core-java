class BrokerRunner{

	public static void main(String[] args){

		String[] name = {"Loki","Sai","Vijay","Gani","Suhas"};

		Deal deal1 = new Deal("House Sale",500000);
		Deal deal2 = new Deal("Land Purchase",750000);
		Deal deal3 = new Deal("Car Sale",300000);

		Deal[] deal = new Deal[3];
		deal[0] = deal1;
		deal[1] = deal2;
		deal[2] = deal3;

		Broker broker = new Broker(name, deal);
		broker.display();
	}
}