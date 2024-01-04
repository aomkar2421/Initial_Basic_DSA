package array;

public class DuplicateElement {
public static void main(String[] args) {
	int arr[]= {21,34,54,76,21,91,34,76};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
			
		}
	}
}
}
