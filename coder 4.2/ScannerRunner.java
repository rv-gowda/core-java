class ScannerRunner{

	public static void main(String[] args){

		String[] name = {"CanonScanner","HPScanner","EpsonScanner","BrotherScanner","XeroxScanner"};

		Document document1 = new Document("ProjectReport",50);
		Document document2 = new Document("Invoice",10);
		Document document3 = new Document("Assignment",25);

		Document[] document = new Document[3];
		document[0] = document1;
		document[1] = document2;
		document[2] = document3;

		Scanner scanner = new Scanner(name, document);
		scanner.display();
	}
}