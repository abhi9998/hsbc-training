/***
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Factorial {

	/***
	 * This program is to find the factorial till a given number
	 * @param args
	 */
	public static void main(String[] args) {

		int factorialTill =10;
		
		int factorial=1;
		
		for(int i=2;i<=factorialTill;i++) {
			factorial*=i;
		}
		
		System.out.println("Factorial of "+factorialTill+" is "+factorial);

	}

}
