class CapStore{
	Cap[] caps;
	int currentIndex=0;

	CapStore(Cap[] caps){
		this.caps=caps;
	}

	void saveCap(Cap cap){
		if(this.caps!=null && cap!=null){
			System.out.println("Executing saveCap");
			int index=this.caps.length-1;

			if(currentIndex<=index){
				this.caps[currentIndex]=cap;
				System.out.println("Saved Cap at index "+currentIndex);
				currentIndex++;
			}
		}
	}
}