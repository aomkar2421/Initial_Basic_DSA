package array;

public class StrReverse {
public static void main(String[] args) {
	String a="Ankita";
	String rev="";
	for (int i = a.length()-1; i>=0; i--) {
		System.out.print(a.charAt(i));
		rev=rev+a.charAt(i);
		
	}
}
}
