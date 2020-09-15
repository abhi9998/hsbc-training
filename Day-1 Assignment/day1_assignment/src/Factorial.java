//program to calculate the factorial of number 6;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Factorial {
	/**
	 *This program is to calculate the factorial of 6 and display the output 
	 * @param args
	 * @see java.lang.String
	 *
	 */
public static void main(String[] args) {
	
	int factorial=1;
	int factorialTill=6;
	
	for(int i=2;i<=factorialTill;i++) {
		
		factorial*=i;
	}
	
	System.out.println("Factorial is: "+factorial);
}
}
