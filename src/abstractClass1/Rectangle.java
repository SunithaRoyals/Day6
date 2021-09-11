package abstractClass1;

import java.util.Scanner;

public class Rectangle extends Shape {
	int width,height;
	protected Rectangle(String name,int width,int wieght) {
		super(name);
		this.width=width;
		this.height=height;
	}
	public  void setWidth() {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the width of rectangle");
		width= sc.nextInt();
		System.out.println("enter the  height of rectangle");
		height = sc.nextInt();
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public void calculateArea()
	{
		float  area= width*height;
		System.out.printf("the area of reactangle is:%.2f",area);
	}
	

	
}


