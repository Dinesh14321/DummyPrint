package TrickyJavaProgram;

public class AlphabetPattern {

	//ASCII Values = A=65, B=66, C=67, D=68, E=69, F=70
	//                 	a=97, b=98, c=99, d=100
	public static void main(String[] args) {

		int alpha = 65;
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((char)alpha+" ");
			}
			alpha++;
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		int alphas = 97;
		
		for (int i = 0; i <=6; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print((char)alphas+" ");
			}
			alphas++;
			System.out.println();
		}
	}

}
