class FarmerStore{
	Farmer[] farmers;
	int currentIndex=0;

	FarmerStore(Farmer[] farmers){
		this.farmers=farmers;
	}

	void saveFarmer(Farmer farmer){
		if(this.farmers!=null && farmer!=null){
			System.out.println("Executing saveFarmer in FarmerStore");
			int index=this.farmers.length-1;

			if(currentIndex<=index){
				this.farmers[currentIndex]=farmer;
				System.out.println("Saved Farmer at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}