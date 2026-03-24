class TollgateStore{
	Tollgate[] tollgates;
	int currentIndex=0;

	TollgateStore(Tollgate[] tollgates){
		this.tollgates=tollgates;
	}

	void saveTollgate(Tollgate tollgate){
		if(this.tollgates!=null && tollgate!=null){
			System.out.println("Executing saveTollgate in TollgateStore");
			int index=this.tollgates.length-1;

			if(currentIndex<=index){
				this.tollgates[currentIndex]=tollgate;
				System.out.println("Saved Tollgate at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}