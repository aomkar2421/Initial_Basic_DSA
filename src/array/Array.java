package array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int a = sc.nextInt();
		int []arr=new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number at index:");
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The value at index "+i+"is : " +arr[i]);
		}
		
		
	}
}
