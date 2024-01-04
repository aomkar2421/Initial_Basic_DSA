package practise;

import java.util.Scanner;

public class Demo {
	float pi=3.14f;
	float r;
	Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		Demo d=new Demo();
		d.radius();
		d.area();
		d.area1();
		d.area2();
		
		
		 
	}
	public void radius() {
		System.out.println("Enter a radius: ");
		 r=sc.nextInt();
	}
		
	public void area() {
		float area=0.5f*pi*r;
		System.out.println("Area of triangle: " +area);
	}
	
	public void area1() {
		System.out.println("Enter a length: ");
		 int l=sc.nextInt();
		 System.out.println("Enter a breadth: ");
		 int b=sc.nextInt();
		 int area=l*b;
		System.out.println("Area of rectangle: " +area);
	}
	
	public void area2() {
		float area=pi*r*r;
		System.out.println("Area of circle: " +area);
	}
	
}


