package abstractClass1;

import java.util.Scanner;

public class Square extends Shape {
	 int side;
	protected Square(String name,int side) {
		super(name);
	this.side=side;
	}
	
	public void  setSide()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the side for square");
		side = sc.nextInt();
	}
	public void calculateArea()

	{
		 int area =side*side;
			System.out.printf(" the area for square%.2f", area);
	}
}


