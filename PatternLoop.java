package TrickyJavaProgram;

public class PatternLoop {

	public static void main(String[] args) {

		System.out.println("----Pyramid Pattern-----");

		for (int i = 1; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*` ");
			}
			System.out.println();
		}

		//Pyramid & Different pattern both are same using SPACE IN K function will differentiated
		System.out.println("----Different Pattern-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			//18602676161  18002026161

		}

		System.out.println("----Model:1-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println("----Model:2-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----Combination of 1 & 2-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
