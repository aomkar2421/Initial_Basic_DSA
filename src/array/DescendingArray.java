package array;

public class DescendingArray {
	public static void main(String[] args) {
		
		int []arr= {23,56,76,32,17};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The value at index "+i+"is : "+arr[i]);
		}
	}
}
