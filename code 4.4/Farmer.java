class Farmer{
	String name;
	String village;
	String crop;
	boolean ownsLand;
	boolean usesTractor;
	int landArea;

	Farmer(String name,String village,String crop,boolean ownsLand,boolean usesTractor,int landArea){
		this.name=name;
		this.village=village;
		this.crop=crop;
		this.ownsLand=ownsLand;
		this.usesTractor=usesTractor;
		this.landArea=landArea;
	}

	void farmerInfo(){
		System.out.println("Name:"+this.name);
		System.out.println("Village:"+this.village);
		System.out.println("Crop:"+this.crop);
		System.out.println("Owns Land:"+this.ownsLand);
		System.out.println("Uses Tractor:"+this.usesTractor);
		System.out.println("Land Area:"+this.landArea);
	}
}