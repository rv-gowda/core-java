class Joke{

	String title;
	String type;

	Joke(String title,String type){
		this.title = title;
		this.type = type;
	}

	void getJoke(){
		System.out.println("Joke title: " + this.title);
		System.out.println("Joke type: " + this.type);
	}
}