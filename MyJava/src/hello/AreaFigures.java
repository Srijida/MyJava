package hello;

import java.util.Scanner;

public class AreaFigures {
	 static void  Area(int a){
	   System.out.println("Area of the square ="+a*a);
	  }
	  static void Area(float x,float y)
	  {
	   System.out.println("Area of the rectangle ="+x*y);
	  } 
	  static void Area(double r)
	  {
		  System.out.println("Area of the circle ="+3.14*r*r);
	  } 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side of Square a =");
		int side=sc.nextInt();
		
		System.out.print("Enter the length of Rectangle x =");
		float length=sc.nextFloat();
		System.out.print("Enter the breadth of Rectangle y =");
		float breadth=sc.nextFloat();
		
		System.out.print("Enter the radius of Circle r =");
		double radius=sc.nextDouble();
		AreaFigures.Area(side);
		AreaFigures.Area(length,breadth);
		AreaFigures.Area(radius);
		   
		
		
	}

}
