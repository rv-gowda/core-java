class SambarRunner{
	public static void main(String[] args){

		Sambar sambar1=new Sambar("Udupi","Toor Dal","Medium",true,true,2);
		Sambar sambar2=new Sambar("Tamil","Vegetables","Spicy",true,true,3);
		Sambar sambar3=new Sambar("Andhra","Onion","Very Spicy",true,true,2);
		Sambar sambar4=new Sambar("Kerala","Coconut","Mild",true,true,3);
		Sambar sambar5=new Sambar("Hotel Style","Mixed Veg","Medium",true,true,4);
		Sambar sambar6=new Sambar("Home Style","Drumstick","Medium",true,true,2);
		Sambar sambar7=new Sambar("Iyengar","Pumpkin","Mild",true,true,3);
		Sambar sambar8=new Sambar("Tiffin","Carrot","Medium",true,true,2);
		Sambar sambar9=new Sambar("Village","Brinjal","Spicy",true,true,3);
		Sambar sambar10=new Sambar("Special","Mixed Veg","Rich",true,true,5);

		Sambar[] sambars=new Sambar[10];
		SambarStore store=new SambarStore(sambars);

		sambar1.sambarInfo(); store.saveSambar(sambar1);
		sambar2.sambarInfo(); store.saveSambar(sambar2);
		sambar3.sambarInfo(); store.saveSambar(sambar3);
		sambar4.sambarInfo(); store.saveSambar(sambar4);
		sambar5.sambarInfo(); store.saveSambar(sambar5);
		sambar6.sambarInfo(); store.saveSambar(sambar6);
		sambar7.sambarInfo(); store.saveSambar(sambar7);
		sambar8.sambarInfo(); store.saveSambar(sambar8);
		sambar9.sambarInfo(); store.saveSambar(sambar9);
		sambar10.sambarInfo(); store.saveSambar(sambar10);
	}
}