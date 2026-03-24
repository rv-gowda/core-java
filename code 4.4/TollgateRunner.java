class TollgateRunner{
	public static void main(String[] args){

		Tollgate tollgate1=new Tollgate("Nice Road","Bangalore","Highway","NHAI",true,100);
		Tollgate tollgate2=new Tollgate("Electronic City","Bangalore","City","Private",true,80);
		Tollgate tollgate3=new Tollgate("Tumkur Road","Bangalore","Highway","NHAI",true,90);
		Tollgate tollgate4=new Tollgate("Mysore Road","Bangalore","Highway","Govt",true,70);
		Tollgate tollgate5=new Tollgate("Hosur Road","Bangalore","City","Private",true,60);
		Tollgate tollgate6=new Tollgate("Airport Road","Bangalore","Express","NHAI",true,120);
		Tollgate tollgate7=new Tollgate("Bellary Road","Bangalore","Highway","Govt",true,85);
		Tollgate tollgate8=new Tollgate("Kanakapura Road","Bangalore","City","Private",true,50);
		Tollgate tollgate9=new Tollgate("Old Madras Road","Bangalore","Highway","NHAI",true,75);
		Tollgate tollgate10=new Tollgate("Bannerghatta Road","Bangalore","City","Govt",true,65);

		Tollgate[] tollgates=new Tollgate[10];
		TollgateStore store=new TollgateStore(tollgates);

		tollgate1.tollgateInfo(); store.saveTollgate(tollgate1);
		tollgate2.tollgateInfo(); store.saveTollgate(tollgate2);
		tollgate3.tollgateInfo(); store.saveTollgate(tollgate3);
		tollgate4.tollgateInfo(); store.saveTollgate(tollgate4);
		tollgate5.tollgateInfo(); store.saveTollgate(tollgate5);
		tollgate6.tollgateInfo(); store.saveTollgate(tollgate6);
		tollgate7.tollgateInfo(); store.saveTollgate(tollgate7);
		tollgate8.tollgateInfo(); store.saveTollgate(tollgate8);
		tollgate9.tollgateInfo(); store.saveTollgate(tollgate9);
		tollgate10.tollgateInfo(); store.saveTollgate(tollgate10);
	}
}