package app1;
import java.util.*;

class Area
{
	float area(float a){
		return a * a;
	}
	float area(float x,float y){
		return x * y;
	}
	double area(double r){
            return 3.14 * r * r;
	}
}

public class Areaofshapes
{
	public static void main(String args[])
	{
		Area ar=new Area();
		float a,x,y;
		double r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value to find area of SQUARE");
		a=s.nextFloat();
		System.out.println("Enter Length and Breadth to find area of RECTANGLE");
		x=s.nextFloat();
		y=s.nextFloat();
		System.out.println("Enter Radius to find area of CIRCLE");
		r=s.nextDouble();
		float sq=ar.area(a);
		float rec=ar.area(x,y);
		double cir=ar.area(r);
		System.out.println("Area of SQUARE:"+ sq);
		System.out.println("Area of RECTANGLE:"+ rec);
		System.out.println("Area of CIRCLE:"+ cir);

	}
}