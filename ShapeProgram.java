package CoreJava;

import java.util.Scanner;

public class Shapes {
	Scanner AB=new Scanner(System.in);

	public void getDimensions() {
	}

	public void showArea() {
	}
      
}

class Circle extends Shapes
{
	private double radius,area;
	public void getDimensions()
	{		
		System.out.println("Enter Radius of Circle");
		radius=AB.nextDouble();
	}
	public void showArea()
	{		
		System.out.println("Radius of the Circle is:"+radius);
		System.out.println("Area of Circle :"+3.14*radius*radius);	
	}
}
class Triangle extends Shapes
{
	private double baselength, height,area;
	public void getDimensions()
	{
		System.out.println("Enter Base Length of Triangle");
		baselength=AB.nextDouble();
		System.out.println("Enter height of Triangle");
		
		height=AB.nextDouble();
		area = baselength*height;
	}

	public void showArea()
	{
		System.out.println("Base Length of Triangle:"+baselength);
		System.out.println("Height of Triangle:"+height);
			System.out.println("Area of Triangle:"+ area);		
	}
}
class dmdShape
{
	public static void main(String args[])
	{
		Shapes S;
		Circle C=new Circle();
		S=C;
		S.getDimensions();
		S.showArea();
		Triangle T=new Triangle();
		S=T;
		S.getDimensions();
		S.showArea();
		
	}	
}
	