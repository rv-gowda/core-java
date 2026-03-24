class GumRunner{
	public static void main(String[] args){

		Gum gum1=new Gum("Center Fresh","Mint","White",true,true,10);
		Gum gum2=new Gum("Orbit","Peppermint","White",true,true,12);
		Gum gum3=new Gum("Boomer","Strawberry","Pink",false,true,8);
		Gum gum4=new Gum("Happydent","Mint","White",true,false,15);
		Gum gum5=new Gum("Center Fruit","Orange","Orange",false,true,6);
		Gum gum6=new Gum("Wrigley","Spearmint","Green",true,true,20);
		Gum gum7=new Gum("Lotte","Bubblegum","Pink",false,true,10);
		Gum gum8=new Gum("Extra","Mint","White",true,true,14);
		Gum gum9=new Gum("Mentos Gum","Mint","White",true,true,16);
		Gum gum10=new Gum("Doublemint","Mint","Green",true,true,18);

		Gum[] gums=new Gum[10];
		GumStore store=new GumStore(gums);

		gum1.gumInfo(); store.saveGum(gum1);
		gum2.gumInfo(); store.saveGum(gum2);
		gum3.gumInfo(); store.saveGum(gum3);
		gum4.gumInfo(); store.saveGum(gum4);
		gum5.gumInfo(); store.saveGum(gum5);
		gum6.gumInfo(); store.saveGum(gum6);
		gum7.gumInfo(); store.saveGum(gum7);
		gum8.gumInfo(); store.saveGum(gum8);
		gum9.gumInfo(); store.saveGum(gum9);
		gum10.gumInfo(); store.saveGum(gum10);
	}
}