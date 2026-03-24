class FarmerRunner{
	public static void main(String[] args){

		Farmer farmer1=new Farmer("Ramesh","Mandya","Sugarcane",true,true,5);
		Farmer farmer2=new Farmer("Suresh","Tumkur","Ragi",true,false,3);
		Farmer farmer3=new Farmer("Mahesh","Hassan","Coffee",true,true,4);
		Farmer farmer4=new Farmer("Ganesh","Mysore","Rice",true,true,6);
		Farmer farmer5=new Farmer("Kiran","Bellary","Cotton",true,false,7);
		Farmer farmer6=new Farmer("Ravi","Dharwad","Wheat",true,true,5);
		Farmer farmer7=new Farmer("Prakash","Chitradurga","Groundnut",true,false,4);
		Farmer farmer8=new Farmer("Manjunath","Kolar","Tomato",true,true,3);
		Farmer farmer9=new Farmer("Shankar","Raichur","Paddy",true,true,6);
		Farmer farmer10=new Farmer("Lokesh","Bagalkot","Maize",true,false,5);

		Farmer[] farmers=new Farmer[10];
		FarmerStore store=new FarmerStore(farmers);

		farmer1.farmerInfo(); store.saveFarmer(farmer1);
		farmer2.farmerInfo(); store.saveFarmer(farmer2);
		farmer3.farmerInfo(); store.saveFarmer(farmer3);
		farmer4.farmerInfo(); store.saveFarmer(farmer4);
		farmer5.farmerInfo(); store.saveFarmer(farmer5);
		farmer6.farmerInfo(); store.saveFarmer(farmer6);
		farmer7.farmerInfo(); store.saveFarmer(farmer7);
		farmer8.farmerInfo(); store.saveFarmer(farmer8);
		farmer9.farmerInfo(); store.saveFarmer(farmer9);
		farmer10.farmerInfo(); store.saveFarmer(farmer10);
	}
}