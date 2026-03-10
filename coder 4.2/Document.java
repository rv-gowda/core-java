class Document{

	String title;
	int pages;

	Document(String title, int pages){
		this.title = title;
		this.pages = pages;
	}

	void getDocument(){
		System.out.println("Document title: " + this.title);
		System.out.println("Number of pages: " + this.pages);
	}
}