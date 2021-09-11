package abstractClass1;

import java.util.Scanner;

public class Circle extends Shape {
	Float radius;
	public  Circle(String name, float radius) {
		super(name);
		this.radius=radius;
	}
	

	public void setRadius(float radius)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the radius");
		radius = sc.nextFloat();
	}
	public Float getRadius()
	{
		return radius;
	}
	void calculateArea()
	{
		
		double area= radius*radius*Math.PI;
		System.out.printf("the  area of circle is %.2f",area);
	}
}


