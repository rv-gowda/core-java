class PrinterRunner{

	public static void main(String[] args){

		String[] brand = {"HP","Canon","Epson","Brother","Samsung"};

		Ink ink1 = new Ink("Black",150);
		Ink ink2 = new Ink("Blue",170);
		Ink ink3 = new Ink("Red",200);

		Ink[] ink = new Ink[3];
		ink[0] = ink1;
		ink[1] = ink2;
		ink[2] = ink3;

		Printer printer1 = new Printer(brand, ink);
		printer1.display();
	}
}