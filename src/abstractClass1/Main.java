package abstractClass1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the name of the shape");
		String name =sc.nextLine();
		switch(name)
		{
		case "circle":
			System.out.println("enter the radius ");
			int radius =sc.nextInt();
			Circle obj= new Circle(name,radius);
			obj.calculateArea();
			
		case"Rectangle":
			System.out.println("enter the width ");
			int width =sc.nextInt();
			System.out.println("enter the height ");
			int height= sc.nextInt();
			Rectangle obj1 = new Rectangle(name,width,height);
			obj1.calculateArea();
	
			
			
		case"Square":
			System.out.println("enter the side ");
			int side=sc.nextInt();
			Square obj2=new Square(name,side);
			obj2.calculateArea();
		 default:System.out.println("you have entered invalid shape ");
		}

	}

}
