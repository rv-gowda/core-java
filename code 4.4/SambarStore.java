class SambarStore{
	Sambar[] sambars;
	int currentIndex=0;

	SambarStore(Sambar[] sambars){
		this.sambars=sambars;
	}

	void saveSambar(Sambar sambar){
		if(this.sambars!=null && sambar!=null){
			System.out.println("Executing saveSambar in SambarStore");
			int index=this.sambars.length-1;

			if(currentIndex<=index){
				this.sambars[currentIndex]=sambar;
				System.out.println("Saved Sambar at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}