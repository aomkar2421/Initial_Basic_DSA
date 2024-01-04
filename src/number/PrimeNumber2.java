package number;

public class PrimeNumber2 {
public static void main(String[] args) {
	int a=9;
	int temp=0;
	for(int i=2;i<=a-1;i++) {
		
		if(a%i==0) {
			temp=temp+1;
		}
		
		}
	if (temp==0) {
		System.out.println("The number is prime");
			
		}
	
	else {
		System.out.println("Number is not prime");
	}

}
}
