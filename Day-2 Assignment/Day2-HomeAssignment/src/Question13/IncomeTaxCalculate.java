package Question13;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class IncomeTaxCalculate {

	public static int calculate(Employee e) {
		int salary = e.getSalary();
		
		if(salary<10000) {
			int temp =MyCalculator.multiply(10, salary);
			return MyCalculator.divide(temp, 100);
		}else {
			int temp =MyCalculator.multiply(30, salary);
			return MyCalculator.divide(temp, 100);
		}
		
	}
}
