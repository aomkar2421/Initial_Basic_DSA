package array;

public class Reverse1 {
	public static void main(String[] args) {
		int arr[]= {45,21,34,89,56};
		for (int i = arr.length-1; i>=0; i--) {
			System.out.println("The reverse array is:"+arr[i] );
		}
	}
}
