package TrickyJavaProgram;

public class StarPatterns {

	public static void main(String[] args) {

		System.out.println("^^^Pattern:1^^^");
		
		for (int i = 0; i <=4; i++) {
			for (int j = 4; j >= i; j--) { // (or) (int j=i,j<=4,j++)
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("^^^Pattern:2^^^");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("^^^Pattern:3^^^");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("^^^Pattern:4^^^");
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k>=i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("^^^Pattern:5^^^");
		for (int i = 0; i <=4; i++) {
			for (int j = 4; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n^^^Square:Pattern^^^\n");
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" #");
			}
			System.out.println();
		}
		System.out.println("\n^^^Alpha Print^^^\n");
		int alpha = 65;
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((char)(alpha+j )+" ");
				//alpha++;
			}
			System.out.println();
		}
	}

}
