package abstractClass2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select the card");
		System.out.println("1.membershipcard");
		System.out.println("2.paybackcard");
		System.out.println("select the number");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("enter the card details");
			String name= sc.next();
			String [] split=name.split(",");
			System.out.println(" enter the pionts in card");
			int pionts=sc.nextInt();
			System.out.println("enetr the total amount");
			double amount=sc.nextLong();
			PayBackCard obj=new	PayBackCard(name, name, name, pionts, amount);
			System.out.println("ANANDHI'S playback card deatils");
			System.out.println("card number: "+split[1]);
			System.out.println("pionts earned: "+pionts);
			System.out.println("total amount: "+amount);
			break;
			case 2:
				System.out.println("enter the card details");
				String name1=sc.next();
				String[]split1=name1.split(",");
				System.out.println("enter the rating ");
				int rating=sc.nextInt();
				System.out.println("COLIn's membership  card deatils");
				MemberShipCard obj1 = new 	MemberShipCard(name1, name1, name1, rating);
				System.out.println("card number: "+split1[1]);
				System.out.println("rating: "+rating);
	    }
	}
}
