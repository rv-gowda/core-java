class CricketWorldCupRunner{

public static void main (String [] args){
	
	CricketWorldCup.registerTeam("Team","Sachin",1,true,11);
	
	CricketWorldCup.saveMatch(12345,"India","Pakistan","venue","Mumbai","12th","12 clock");


	CricketWorldCup.savePlayer("Sachin","India",10,"batsman",true,false,10,100,0,10,"good");
	
	CricketWorldCup.calculateRunRate(100,10,5,"win",100,3,"Sachin");
	
	
	
	


}
}