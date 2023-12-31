package package1;

public class StarDiagonal1 {

	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i++) {
			for (int j = 0; j > i; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				if(j==i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
