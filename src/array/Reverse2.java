package array;

public class Reverse2 {
	public static void main(String[] args) {
		int arr[]= {98,43,76,12,55};
		int temp;
		int j=arr.length-1;
		for (int i = 0; i <j; i++) {

			temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;

		}
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
