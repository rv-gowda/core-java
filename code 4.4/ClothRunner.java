class ClothRunner{
	public static void main(String[] args){

		Cloth cloth1=new Cloth("Shirt","Blue","Nike",true,true,40);
		Cloth cloth2=new Cloth("Pant","Black","Levis",true,true,32);
		Cloth cloth3=new Cloth("Tshirt","White","Puma",true,false,38);
		Cloth cloth4=new Cloth("Jacket","Brown","Zara",false,true,42);
		Cloth cloth5=new Cloth("Kurta","Yellow","FabIndia",true,true,40);
		Cloth cloth6=new Cloth("Jeans","Blue","Wrangler",true,true,34);
		Cloth cloth7=new Cloth("Shorts","Grey","Adidas",true,false,30);
		Cloth cloth8=new Cloth("Blazer","Black","Raymond",false,true,44);
		Cloth cloth9=new Cloth("Sweater","Green","H&M",false,false,42);
		Cloth cloth10=new Cloth("Hoodie","Red","HRX",true,true,40);

		Cloth[] cloths=new Cloth[10];
		ClothStore store=new ClothStore(cloths);

		cloth1.clothInfo(); store.saveCloth(cloth1);
		cloth2.clothInfo(); store.saveCloth(cloth2);
		cloth3.clothInfo(); store.saveCloth(cloth3);
		cloth4.clothInfo(); store.saveCloth(cloth4);
		cloth5.clothInfo(); store.saveCloth(cloth5);
		cloth6.clothInfo(); store.saveCloth(cloth6);
		cloth7.clothInfo(); store.saveCloth(cloth7);
		cloth8.clothInfo(); store.saveCloth(cloth8);
		cloth9.clothInfo(); store.saveCloth(cloth9);
		cloth10.clothInfo(); store.saveCloth(cloth10);
	}
}