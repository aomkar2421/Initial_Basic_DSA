package number;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int a=sc.nextInt();
	
	System.out.println("Enter 2nd number");
	int b=sc.nextInt();
	
	int c=0;
	for (int i = a; i <=b; i++) {
		c=c+i;
		
	}
	System.out.println(c);
}
}
