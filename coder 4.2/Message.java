class Message{

	String text;
	String color;

	Message(String text,String color){
		this.text = text;
		this.color = color;
	}

	void getMessage(){
		System.out.println("Message text: " + this.text);
		System.out.println("Message color: " + this.color);
	}
}