class SaltStore{
	Salt[] salts;
	int currentIndex=0;

	SaltStore(Salt[] salts){
		this.salts=salts;
	}

	void saveSalt(Salt salt){
		if(this.salts!=null && salt!=null){
			System.out.println("Executing saveSalt in SaltStore");
			int index=this.salts.length-1;

			if(currentIndex<=index){
				this.salts[currentIndex]=salt;
				System.out.println("Saved Salt at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}