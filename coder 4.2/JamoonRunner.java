class JamoonRunner{

	public static void main(String[] args){

		String[] name = {"GulabJamoon","KalaJamoon","DryJamoon","MiniJamoon","SoftJamoon"};

		Sweet sweet1 = new Sweet("Rose",50);
		Sweet sweet2 = new Sweet("Milk",60);
		Sweet sweet3 = new Sweet("Chocolate",70);

		Sweet[] sweet = new Sweet[3];
		sweet[0] = sweet1;
		sweet[1] = sweet2;
		sweet[2] = sweet3;

		Jamoon jamoon = new Jamoon(name, sweet);
		jamoon.display();
	}
}