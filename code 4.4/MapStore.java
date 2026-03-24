class MapStore{
	Map[] maps;
	int currentIndex=0;

	MapStore(Map[] maps){
		this.maps=maps;
	}

	void saveMap(Map map){
		if(this.maps!=null && map!=null){
			System.out.println("Executing saveMap in MapStore");
			int index=this.maps.length-1;

			if(currentIndex<=index){
				this.maps[currentIndex]=map;
				System.out.println("Saved Map at index "+currentIndex);
				currentIndex++;
				System.out.println("Next index:"+currentIndex);
			}
		}
	}
}