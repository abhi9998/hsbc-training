package Question13;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class Employee {

	private int salary;
	private static int total=0;
	private static int count=0;

	public Employee(int salary) {
		this.salary=salary;
		total = MyCalculator.add(total, salary);
		count++;
	}
	public int getSalary() {
		return salary;
	}
	
	public static int getTotal() {
		return total;
	}
	public static int getAvg() {
		if(count==0)
			return 0;
		else
		return MyCalculator.divide(total, count);
	}
}
