class ProfileStore{
	Profile[] profiles;
	int currentIndex=0;

	ProfileStore(Profile[] profiles){
		this.profiles=profiles;
	}

	void saveProfile(Profile profile){
		if(this.profiles!=null && profile!=null){
			System.out.println("Executing saveProfile in ProfileStore");
			int index=this.profiles.length-1;

			if(currentIndex<=index){
				this.profiles[currentIndex]=profile;
				System.out.println("Saved Profile at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}