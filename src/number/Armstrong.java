package number;


public class Armstrong {
public static void main(String[] args) {
	int a=153;
	int n1=a;
	int length=0;
	
	while(n1!=0) {
		length =length+1;
		n1=n1/10;
	}
	
	int n2=a;
	int arm=0;
	while(n2!=0) {
		int mul=1;
	int	rem=n2%10;
		for (int i = 1; i < args.length; i++) {
			mul=mul*rem;
		}
		arm=arm+mul;
		n2=n2/10;
	}
	if(arm==a) {
		System.out.println("Armstong Number");
	}
	
	else {
		System.out.println("Not Armstrong");
	}
}
}
