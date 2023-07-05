package hello;
import java.util.*;
public class Area_Shapes {
	
	void area(float x)
    {
        System.out.println("The area of the square is "+x*x+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the side of Square :");
		int side=sc.nextInt();
		
		System.out.print("Enter the length of Rectangle :");
		float length=sc.nextFloat();
		System.out.print("Enter the breadth of Rectangle :");
		float breadth=sc.nextFloat();
		
		System.out.print("Enter the radius of Circle :");
		double radius=sc.nextDouble();
		
		Area_Shapes ob = new Area_Shapes();
		   ob.area(side);
		   ob.area(length,breadth);
		   ob.area(radius);
	}

}
