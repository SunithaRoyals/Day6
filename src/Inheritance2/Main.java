package Inheritance2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the player name");
		String name= sc.next();
		System.out.println("enetr the Teamname name");
		String teamName=sc.next();
		System.out.println("enetr the  no . of matches played ");
		int noOfMatchesPlayed=sc.nextInt();
		System.out.println("enetr the total Runs scored");
		long totalRunsScored=sc.nextLong();
		System.out.println("enetr the  no of Wickets taken ");
		int noOfWicketsTaken=sc.nextInt();
		Player obj= new Player(name, teamName, noOfWicketsTaken, totalRunsScored, noOfWicketsTaken);
		obj.displayPlayerStatstics();
		
	}
}
