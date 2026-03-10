class Banner{

	String[] name;
	Message[] message;

	Banner(String[] name, Message[] message){
		this.name = name;
		this.message = message;
	}

	void display(){
		System.out.println("Executing the display method in Banner.");

		if(this.name != null){
			System.out.println("Total number of banners: " + this.name.length);
			for(String name : this.name){
				System.out.println("Banner name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.message != null){
			System.out.println("Total number of messages: " + this.message.length);
			for(Message messages : this.message){
				messages.getMessage();
			}
		}else{
			System.out.println("The message is null.");
		}
	}
}