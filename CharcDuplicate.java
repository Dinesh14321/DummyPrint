package TrickyJavaProgram;

public class CharcDuplicate {
	
	//vowels = "aeiou";
	public static boolean isVowel(char z) {
		return z=='a'|| z=='e'|| z=='i'|| z=='o'|| z=='u'||z=='A'|| z=='E'|| z=='I'|| z=='O'|| z=='U';
		
	}

	public static void main(String[] args) {
		String str = "Engineering Student"; // vowels present = E i e e i u e
		int vCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				vCount++;
			}
		}
		System.out.println(vCount);
		
	}

}
