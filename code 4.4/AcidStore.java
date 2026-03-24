class AcidStore{
	Acid[] acids;
	int currentIndex=0;

	AcidStore(Acid[] acids){
		this.acids=acids;
	}

	void saveAcid(Acid acid){
		if(this.acids!=null && acid!=null){
			System.out.println("Executing saveAcid in AcidStore");
			int index=this.acids.length-1;

			if(currentIndex<=index){
				this.acids[currentIndex]=acid;
				System.out.println("Saved Acid at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}