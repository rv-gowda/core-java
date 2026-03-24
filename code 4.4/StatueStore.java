class StatueStore{
	Statue[] statues;
	int currentIndex=0;

	StatueStore(Statue[] statues){
		this.statues=statues;
	}

	void saveStatue(Statue statue){
		if(this.statues!=null && statue!=null){
			System.out.println("Executing saveStatue in StatueStore");
			int index=this.statues.length-1;

			if(currentIndex<=index){
				this.statues[currentIndex]=statue;
				System.out.println("Saved Statue at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}