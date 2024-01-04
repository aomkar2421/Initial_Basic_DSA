package array;

public class AscendingArray {
	public static void main(String[] args) {

		int arr[]= {12,23,11,24,5};

		System.out.println("Original Array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The value at index "+i+"is : " +arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		
		System.out.println("Reversed Array ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The value at index "+i+"is : " +arr[i]);
		}
	}
}
