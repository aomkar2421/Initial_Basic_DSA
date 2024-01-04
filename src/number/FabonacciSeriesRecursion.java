package number;


public class FabonacciSeriesRecursion {
	
	static int a=0;
	 static int b=1;

public static void main(String[] args) {
	
		System.out.print(a+" "+b);
	FabonacciSeriesRecursion fb=new FabonacciSeriesRecursion();
		fb.fabonacci(10);
}

void fabonacci(int i) {
	if(i>=1) {
		int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		fabonacci(i-1);
				
		
	}
}
}
