package Inheritance2;

public class Player implements IPlayerStatistics {
	String name;
	String teamName;
	int noOfMatches;
	long totalRunsScored;
	int noOfWicketsTaken;
	public Player(String name,	String teamName,int noOfMatches,long totalRunsScored,int noOfWicketsTaken)
	{
		 this.name=name;
		 this.teamName=teamName;
		 this.noOfMatches = noOfMatches;
		 this.totalRunsScored=totalRunsScored;
		 this.noOfWicketsTaken=noOfWicketsTaken;
	}
public void displayPlayerStatstics() {
	System.out.println("enetr the player name:" +name);
	System.out.println("enetr the teamname name: " +teamName);
	System.out.println("enetr the  no . of matches played :" +noOfMatches);
	System.out.println("enetr the total runs scored :" +totalRunsScored);
	System.out.println("enetr the  no of wickets taken: " +noOfWicketsTaken);
}


}

