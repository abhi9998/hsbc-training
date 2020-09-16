/***
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class BiggestNumber {
	/***
	 * This program is to find the greatest of three numbers
	 * @param args
	 */
	public static void main(String[] args) {
		
		int firstNumber =10;
		int secondNumber = 20;
		int thirdNumber =30;
		int answer;
		
		if(firstNumber>secondNumber && firstNumber> thirdNumber) {
				answer = firstNumber;
		}else if(secondNumber> firstNumber && secondNumber >thirdNumber) {
				answer = secondNumber;
		}else {
				answer = thirdNumber;
		}
		
		System.out.println("Among three numbers "+firstNumber+" "+secondNumber+" "+thirdNumber);
		System.out.println("The biggest number is "+answer);

	}

}
