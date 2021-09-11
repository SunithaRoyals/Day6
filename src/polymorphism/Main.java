package polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.player details nof the delivery");
		System.out.println("2.run deatils of the delivery");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("the  name of bowleris ");
		    String bowler =sc.next();;
			String []split= bowler.split(",");
			System.out.println("the name of batsman");
			String batsman= sc.next();
			String []split1=batsman.split(",");
			Delivery obj=new Delivery();
			obj.displayDeliveryDetails(split[1],split1[1]);
			break;
		 
		case 2:
			System.out.println("enetr the no of deliveries");
			int del =sc.nextInt();
			System.out.println("enetr the no of runs");
			long runs =sc.nextLong();
			Delivery obj1 = new Delivery();
			obj1.displayDeliveryDetails(del, runs);
			if(runs>=4)
			{
				System.out.println("it's a boundary");
			}
			
		
		}
		

	}
}

