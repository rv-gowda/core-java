class StatueRunner{
	public static void main(String[] args){

		Statue statue1=new Statue("Statue of Unity","Iron","Gujarat","Ram V Sutar",true,182);
		Statue statue2=new Statue("Liberty","Copper","USA","Bartholdi",true,93);
		Statue statue3=new Statue("Buddha","Stone","Bodh Gaya","Unknown",true,25);
		Statue statue4=new Statue("Shiva","Concrete","Coimbatore","Artist1",false,34);
		Statue statue5=new Statue("Ambedkar","Bronze","Delhi","Artist2",true,20);
		Statue statue6=new Statue("Gandhi","Stone","Mumbai","Artist3",true,18);
		Statue statue7=new Statue("Krishna","Marble","Udupi","Artist4",false,15);
		Statue statue8=new Statue("Hanuman","Concrete","Hampi","Artist5",true,40);
		Statue statue9=new Statue("Nehru","Bronze","Delhi","Artist6",true,12);
		Statue statue10=new Statue("Subhash","Stone","Kolkata","Artist7",true,16);

		Statue[] statues=new Statue[10];
		StatueStore store=new StatueStore(statues);

		statue1.statueInfo(); store.saveStatue(statue1);
		statue2.statueInfo(); store.saveStatue(statue2);
		statue3.statueInfo(); store.saveStatue(statue3);
		statue4.statueInfo(); store.saveStatue(statue4);
		statue5.statueInfo(); store.saveStatue(statue5);
		statue6.statueInfo(); store.saveStatue(statue6);
		statue7.statueInfo(); store.saveStatue(statue7);
		statue8.statueInfo(); store.saveStatue(statue8);
		statue9.statueInfo(); store.saveStatue(statue9);
		statue10.statueInfo(); store.saveStatue(statue10);
	}
}