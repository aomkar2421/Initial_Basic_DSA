package statement;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1st number:");
			int a=sc.nextInt();

			System.out.println("Enter 2nd number:");
			int b=sc.nextInt();

			System.out.println("Select operation:  1.+, 2.-, 3.*, 4./");	
			int c =sc.nextInt();

			switch (c) {
			case 1: {
				int d = a+b;
				System.out.println("Addition is :" +d);	
				break;
			}

			case 2: {
				int d = a-b;
				System.out.println("Substraction is :" +d);	
				break;
			}

			case 3: {
				int d = a*b;
				System.out.println("multiplication is :" +d);	
				break;
			}

			case 4: {
				int d = a/b;
				System.out.println("Division is :" +d);	
				break;
			}
			default:
				break;
			}
			
			System.out.println("do you want to continue 1.Yes 2.No");
			int i=sc.nextInt();
			if (i==2) {
				break;
			}
			
		}

	}

}

