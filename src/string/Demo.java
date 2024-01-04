package string;

public class Demo {
	public static void main(String[] args) {
		
		String a="ANKITA";
		String rev="";
		for ( int i =a.length()-1; i>=0; i--) {
			 System.out.println(a.charAt(i));
			 rev=rev+a.charAt(i);
		}
		 System.out.println(rev);
	}

}
