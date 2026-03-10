class Broker{

	String[] name;
	Deal[] deal;

	Broker(String[] name, Deal[] deal){
		this.name = name;
		this.deal = deal;
	}

	void display(){
		System.out.println("Executing the display method in Broker.");

		if(this.name != null){
			System.out.println("Total number of brokers: " + this.name.length);
			for(String name : this.name){
				System.out.println("Broker name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.deal != null){
			System.out.println("Total number of deals: " + this.deal.length);
			for(Deal deals : this.deal){
				deals.getDeal();
			}
		}else{
			System.out.println("The deal is null.");
		}
	}
}