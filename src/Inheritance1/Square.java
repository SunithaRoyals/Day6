package Inheritance1;

public class Square extends Shape {
	      private int side;
	      public Square(int side) {
	   	this.side= side;
		
	}
	public void calculteArea()
	{
		double area =side*side;
		System.out.printf("the area of Square is: %.2f",area);
	}

}

}
