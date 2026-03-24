class ClothStore{
	Cloth[] cloths;
	int currentIndex=0;

	ClothStore(Cloth[] cloths){
		this.cloths=cloths;
	}

	void saveCloth(Cloth cloth){
		if(this.cloths!=null && cloth!=null){
			System.out.println("Executing saveCloth in ClothStore");
			int index=this.cloths.length-1;

			if(currentIndex<=index){
				this.cloths[currentIndex]=cloth;
				System.out.println("Saved Cloth at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}
