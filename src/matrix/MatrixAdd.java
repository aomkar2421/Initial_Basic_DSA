package matrix;

import java.util.Iterator;
import java.util.Scanner;

public class MatrixAdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter row number: ");
		int r=sc.nextInt();
		System.out.println("Enter column number: ");
		int c=sc.nextInt();
		
		int arr[][]=new int [r][c];
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("Enter number at index" +i+j);
			}
		}

	}
}
