package polymorphism;

public class Delivery {
	public void displayDeliveryDetails(String bowler,String batsman)
	{
		System.out.println("the last name of bowleris: " +bowler);
		System.out.println("the last name of batsamn is :" +batsman);
	}
	public void displayDeliveryDetails(long runs,long del)
	{
		System.out.println("enter the no. of deliveries: " +del);
		System.out.println("enter the no. of runs : " +runs);
		if(runs==4||runs==6)
		{
			System.out.println("it's a  boundary");
		}
		
     }
}
