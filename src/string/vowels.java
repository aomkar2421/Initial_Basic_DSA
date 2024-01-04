package string;

public class vowels {
	public static void main(String[] args) {
		String st= "IHATEYOUOMKAR";
		st=st.toLowerCase();
		int counter=0;
		for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i)=='a' ||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				counter ++;
				System.out.println();
			}
		}
		System.out.println(counter);
	}
}
