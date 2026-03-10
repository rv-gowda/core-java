class Scanner{

	String[] name;
	Document[] document;

	Scanner(String[] name, Document[] document){
		this.name = name;
		this.document = document;
	}

	void display(){
		System.out.println("Executing the display method in Scanner.");

		if(this.name != null){
			System.out.println("Total number of scanners: " + this.name.length);
			for(String name : this.name){
				System.out.println("Scanner name: " + name);
			}
		}else{
			System.out.println("The name is null.");
		}

		if(this.document != null){
			System.out.println("Total number of documents: " + this.document.length);
			for(Document documents : this.document){
				documents.getDocument();
			}
		}else{
			System.out.println("The document is null.");
		}
	}
}