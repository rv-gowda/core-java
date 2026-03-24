class GumStore{
	Gum[] gums;
	int currentIndex=0;

	GumStore(Gum[] gums){
		this.gums=gums;
	}

	void saveGum(Gum gum){
		if(this.gums!=null && gum!=null){
			System.out.println("Executing saveGum in GumStore");
			int index=this.gums.length-1;

			if(currentIndex<=index){
				this.gums[currentIndex]=gum;
				System.out.println("Saved Gum at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}