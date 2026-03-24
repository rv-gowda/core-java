class CapRunner{
	public static void main(String[] args){

		Cap cap1=new Cap("Nike","Black",500,"M",true,"Cotton");
		Cap cap2=new Cap("Adidas","White",600,"L",false,"Polyester");
		Cap cap3=new Cap("Puma","Blue",450,"S",true,"Cotton");
		Cap cap4=new Cap("Reebok","Red",550,"M",false,"Wool");
		Cap cap5=new Cap("Fila","Green",400,"L",true,"Cotton");
		Cap cap6=new Cap("HRX","Black",350,"S",true,"Polyester");
		Cap cap7=new Cap("Zara","White",700,"M",false,"Wool");
		Cap cap8=new Cap("H&M","Blue",300,"L",true,"Cotton");
		Cap cap9=new Cap("Levis","Grey",650,"M",false,"Denim");
		Cap cap10=new Cap("Gucci","Black",2000,"L",true,"Premium");

		Cap[] caps=new Cap[10];
		CapStore store=new CapStore(caps);

		cap1.capInfo(); store.saveCap(cap1);
		cap2.capInfo(); store.saveCap(cap2);
		cap3.capInfo(); store.saveCap(cap3);
		cap4.capInfo(); store.saveCap(cap4);
		cap5.capInfo(); store.saveCap(cap5);
		cap6.capInfo(); store.saveCap(cap6);
		cap7.capInfo(); store.saveCap(cap7);
		cap8.capInfo(); store.saveCap(cap8);
		cap9.capInfo(); store.saveCap(cap9);
		cap10.capInfo(); store.saveCap(cap10);
	}
}