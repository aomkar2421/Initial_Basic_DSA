package array;

public class EqualArray 
{
	public static void main(String[] args) 
	{
		int counter=0;
		int arr1[]= {12,23,54,67,87};
		int arr2[]= {12,22,54,66,87};
		int i,j;
		for (i = 0; i < arr1.length; i++) 
		{
			for (i = 0; i < arr2.length; i++) 
			{
				if (arr1[i]!=arr2[i]) 
				{
					counter++;
				} 
				
			}
			
		}
		System.out.println(counter);
		if (counter==0) {
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
		
	}
}
