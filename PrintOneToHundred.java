package TrickyJavaProgram;

public class PrintOneToHundred {

	public static void printOneTo100() {
		System.out.println("\n\nMethod=1 using Numerics\n\n");

		// Print 1 to 100

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

		}
	}

	public static void notToUseNumeric() {

		System.out.println("\n\n Method=2 Not using Numerics\n\n");

		int one = 'A' / 'A'; // 1
		String s1 = ".........."; // Printed 10 dots = 10*10=100
		for (int i = one; i <= (s1.length() * s1.length()); i++) {
			System.out.println(i);

		}
	}

	public static void notUsingNumeric() {

		int one = 'A' / 'A'; // 1

		System.out.println("\n\n Method=3 \n\n");
		// ASCII Value for [a=97, b=98, c=99, d=100]

		for (int i = one; i <= 'd'; i += one) {
			System.out.println(i);

		}

	}
	
	public static void notUsingLoop(int num) {
		if (num <=100) {
			System.out.println(num); //1 2 3...100
			num++;  //1+1=2,2+1=3,3+1=4
			notUsingLoop(num);
		}
		
	}

	public static void main(String[] args) {
		
		printOneTo100();
		
		notToUseNumeric();
		
		notUsingNumeric();
		
		notUsingLoop(1);

	}

}
