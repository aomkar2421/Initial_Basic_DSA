package number;


public class PalindromeNumber {
public static void main(String[] args) {
	
	int a=122;
	int temp=a;
	int rem,rev=0;
	
	while(temp!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(a==rev) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
