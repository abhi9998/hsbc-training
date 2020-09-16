package Question13;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class MainRunner {

	public static void main(String[] args) {
		
		Employee e[] =new Employee[3];
		e[0]=new Employee(10);
		e[1]= new Employee(20);
		e[2]= new Employee(30);
		
		System.out.println("Total salary of all employee "+Employee.getTotal());
		
		System.out.println("Avg of salary is "+Employee.getAvg());
		
		System.out.println("Income tax of emp0 is "+IncomeTaxCalculate.calculate(e[0]));

	}

}
