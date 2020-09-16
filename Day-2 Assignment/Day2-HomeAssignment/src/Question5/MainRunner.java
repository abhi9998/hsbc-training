package Question5;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class MainRunner {

	public static void main(String[] args) {
		
		Person per = new Person("Abhi",22,"Junagadh");
		
		HomeLoan h1 = new HomeLoan(per,2,1000,24);
		
		System.out.println("Interest is "+h1.interest());
		System.out.println("Detail of person is"+h1.getDetailsOfPerson());
		System.out.println("rate of interest is "+h1.getRateOfInterest()+"%");
		
		
		
		PersonalLoan p1 = new PersonalLoan(per,2,1000,24);
		
		System.out.println("Interest is "+p1.interest());
		System.out.println("Detail of person is "+p1.getDetailsOfPerson());
		System.out.println("rate of interest is "+p1.getRateOfInterest()+"%");

	}

}
