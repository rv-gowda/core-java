class CricketWorldCup{

static void registerTeam(String teamName,String captainName,int ranking,boolean isHost,int squadSize){
	
System.out.println("The team name is :"+teamName);
if(teamName==null)
{
	System.out.println("The data is invalid");
	return;
}


System.out.println("The  captain name is "+captainName);
if(captainName==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println("The team ranking "+ranking);
if(ranking<=0)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println("The match is hosted in "+isHost);
if(isHost==false)
{
	System.out.println("The data is invalid");
	return;
}

System.out.println(" The Squad size is "+squadSize);
if(squadSize<=10)
{
	System.out.println("The data is invalid");
	return;
}

System.out.println("The data's are valid");
}



static void saveMatch(int matchId,String team1,String team2,String venue,String city,String date,String time){
System.out.println("The match id :"+matchId);
if(matchId<=10000)
{
	System.out.println("The data is invalid");
	return;
}


System.out.println("The name of first team is  "+team1);
if(team1==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println("The name of second team is  "+team2);
if(team2==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println("The venue of the match is : "+venue);
if(venue==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println(" The city where match is conducted"+city);
if(city==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println(" The date of the match "+date);
if(date==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println(" The match time :"+time);
if(time==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println("The data's are valid");
}



static void savePlayer(String playerName,String teamName,int jerseyNumber,String role,boolean isCaptain,boolean isViceCaptain,int matchesPlayed,int runScored,int wicketTaken,int battingAverage,String bowlingEconomy){


System.out.println(" The player name is  :"+playerName);
if(playerName==null)
{
	System.out.println("The data is invalid");
	return;
}



System.out.println(" The team name is  :"+teamName);
if(teamName==null)
{
	System.out.println("The data is invalid");
	return;
}

System.out.println(" The jerseyNumber is  :"+jerseyNumber);
if(jerseyNumber<=0)
{
	System.out.println("The data is invalid");
	return;
}


System.out.println(" The role of the player  :"+role);
if(role==null)
{
	System.out.println("The data is invalid");
	return;
}


System.out.println(" Is he the captain  :"+isCaptain);
if(isCaptain==true)
{
	System.out.println("He is the captain");
	
}

System.out.println(" Is he the vicecaptain  :"+ isViceCaptain);
if( isViceCaptain==true)
{
	System.out.println("He is the vicecaptain");
	
}


System.out.println(" Number of matches played   :"+ matchesPlayed);
if( matchesPlayed<0)
{
	System.out.println("The data is invalid ");
	return;
	
}

System.out.println(" Runs the player scored  :"+ runScored);
if( runScored<0)
{
	System.out.println("The data is invalid ");
	return;
	
}

System.out.println(" The wicket taken by the player  :"+ wicketTaken);
if( wicketTaken<0)
{
	System.out.println("The data is invalid ");
	return;
	
}


System.out.println(" The batting average of player  :"+ battingAverage);
if( battingAverage<0)
{
	System.out.println("The data is invalid ");
	return;
	
}

System.out.println(" The bowling economy is  :"+ bowlingEconomy);
if( bowlingEconomy==null)
{
	System.out.println("The data is invalid ");
	return;
	
}
System.out.println("The data's  given are valid ");

}





static void calculateRunRate(int totalRuns,int oversFaced,int wicketLost,String checkQualification,int netRunRate,int matchesLeft,String manOfTheMatch){
	System.out.println(" The total Runs scored is  :"+ totalRuns);
if( totalRuns<=0)
{
	System.out.println("The data is invalid ");
	return;
}


System.out.println(" The total overs faced  :"+ oversFaced);
if( oversFaced<=0)
{
	System.out.println("The data is invalid ");
	return;
	
}

System.out.println(" The total wicket lost  :"+ wicketLost);
if( wicketLost<=0)
{
	System.out.println("The data is invalid ");
	return;
	
}


System.out.println(" The qualification of the team  :"+ checkQualification);
if( checkQualification==null)
{
	System.out.println("The data is invalid ");
	return;
}


System.out.println(" The net Run rate scored is  :"+ netRunRate);
if( netRunRate<=0)
{
	System.out.println("The data is invalid ");
	return;
}

System.out.println(" The matches left  :"+ matchesLeft);
if( matchesLeft<0)
{
	System.out.println("The data is invalid ");
	return;
}

System.out.println(" The man of the match  :"+ manOfTheMatch);
if( manOfTheMatch==null)
{
	System.out.println("The data is invalid ");
	return;
}
System.out.println("The data's are valid");
}

}