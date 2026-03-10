class Joker{

	String[] name;
	Joke[] joke;

	Joker(String[] name, Joke[] joke){
		this.name = name;
		this.joke = joke;
	}

	void display(){
		System.out.println("Executing the display method in Joker.");

		if(this.name != null){
			System.out.println("Total number of jokers: " + this.name.length);
			for(String name : this.name){
				System.out.println("Joker name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.joke != null){
			System.out.println("Total number of jokes: " + this.joke.length);
			for(Joke jokes : this.joke){
				jokes.getJoke();
			}
		}else{
			System.out.println("The joke is null.");
		}
	}
}