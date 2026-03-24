class Map{
	String mapType;
	String region;
	String publisher;
	boolean laminated;
	boolean colored;
	int year;

	Map(String mapType,String region,String publisher,boolean laminated,boolean colored,int year){
		this.mapType=mapType;
		this.region=region;
		this.publisher=publisher;
		this.laminated=laminated;
		this.colored=colored;
		this.year=year;
	}

	void mapInfo(){
		System.out.println("Map Type:"+this.mapType);
		System.out.println("Region:"+this.region);
		System.out.println("Publisher:"+this.publisher);
		System.out.println("Is Laminated:"+this.laminated);
		System.out.println("Is Colored:"+this.colored);
		System.out.println("Year:"+this.year);
	}
}