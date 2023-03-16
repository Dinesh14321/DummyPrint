package TrickyJavaProgram;

public class NumValue {

	public static void testNum() {

		Integer num1 = 100;
		Integer num2 = 100;
		if (num1 == num2) {
			System.out.println("Both are equals");

		} else {
			System.out.println("Both are not equals");

		}
		// Integer Maximum catching value is (-127 to 128)

		System.out.println("\n Method:2 \n");
		Integer num3 = 129;
		Integer num4 = 129;
		if (num3 == num4) {
			System.out.println("Both are equals");

		} else {
			System.out.println("Both are not equals");
		}
	}
	public static void notANumber() {
		System.out.println("\n Not A Number \n");
		//Numbers = Integer,Double, Float
		
		//System.out.println(2/0); //Arithmetic Exception
		System.out.println(2.0/0); //Infinity
		System.out.println(15.3f/0);//Infinity
		System.out.println(5/0.0); //Infinity
		System.out.println(0.0/0.0); //NaN
		System.out.println(0.0/0); //NaN
		System.out.println(Math.sqrt(-1)); //NaN

	}
	
	public void differencePrintL() {
		
		//Maxi limit of Integer is 32bit //-2147483648 to 2147483647
		long longNumberWithoutL = 1000*245*50*50*100;
		long longNumberWithL = 1000*245*50*50*100l; // using long we are getting exact value
		
		System.out.println(longNumberWithoutL);
		System.out.println(longNumberWithL);
	}
	
	public void minNumberOfDatas() {
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE,0.0d)); //0.0
	}

	public static void main(String[] args) {
		testNum();
		notANumber();
		NumValue nv = new NumValue();
		nv.differencePrintL();
		nv.minNumberOfDatas();
	}

}
