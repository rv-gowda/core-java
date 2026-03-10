class JokerRunner{

	public static void main(String[] args){

		String[] name = {"Raju","Kiran","Mahesh","Suresh","Ajay"};

		Joke joke1 = new Joke("FunnyStory","Comedy");
		Joke joke2 = new Joke("SchoolJoke","Kids");
		Joke joke3 = new Joke("OfficeJoke","Work");

		Joke[] joke = new Joke[3];
		joke[0] = joke1;
		joke[1] = joke2;
		joke[2] = joke3;

		Joker joker = new Joker(name, joke);
		joker.display();
	}
}