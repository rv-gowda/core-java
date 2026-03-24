class AcidRunner{
	public static void main(String[] args){

		Acid acid1=new Acid("Hydrochloric Acid","HCl","Mineral",true,true,1);
		Acid acid2=new Acid("Sulfuric Acid","H2SO4","Mineral",true,true,1);
		Acid acid3=new Acid("Nitric Acid","HNO3","Mineral",true,true,1);
		Acid acid4=new Acid("Acetic Acid","CH3COOH","Organic",false,false,3);
		Acid acid5=new Acid("Citric Acid","C6H8O7","Organic",false,false,3);
		Acid acid6=new Acid("Formic Acid","HCOOH","Organic",false,true,2);
		Acid acid7=new Acid("Phosphoric Acid","H3PO4","Mineral",false,false,2);
		Acid acid8=new Acid("Carbonic Acid","H2CO3","Weak",false,false,4);
		Acid acid9=new Acid("Lactic Acid","C3H6O3","Organic",false,false,4);
		Acid acid10=new Acid("Tartaric Acid","C4H6O6","Organic",false,false,3);

		Acid[] acids=new Acid[10];
		AcidStore store=new AcidStore(acids);

		acid1.acidInfo(); store.saveAcid(acid1);
		acid2.acidInfo(); store.saveAcid(acid2);
		acid3.acidInfo(); store.saveAcid(acid3);
		acid4.acidInfo(); store.saveAcid(acid4);
		acid5.acidInfo(); store.saveAcid(acid5);
		acid6.acidInfo(); store.saveAcid(acid6);
		acid7.acidInfo(); store.saveAcid(acid7);
		acid8.acidInfo(); store.saveAcid(acid8);
		acid9.acidInfo(); store.saveAcid(acid9);
		acid10.acidInfo(); store.saveAcid(acid10);
	}
}