package string;

public class Reverse {
	public static void main(String[] args) {
		
		String st="TOPPER";
		String rev="";
		for (int i=st.length()-1; i>=0; i--) {
			System.out.println(st.charAt(i));
			rev=rev +st.charAt(i);
		}
	}
}
