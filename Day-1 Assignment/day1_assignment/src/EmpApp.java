/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class EmpApp {
	Emp e;
	public EmpApp(Emp e) {
		this.e =e;
	}
	public Emp getEmp() {
		return e;
	}

	/**
	 * This creates object of class present different file and also explains the has-a relationship.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Emp e = new Emp(100,"Abhi","Junagadh",1000);
		
		/*
		 * e.empId =123; e.empName="Abhi Zanzarukiya"; e.city="Junagadh";
		 * e.salary=10000;
		 */
		
		EmpApp app = new EmpApp(e);
		
		Emp emp = app.getEmp();
		String info = e.getEmpDetails();
		System.out.println(info);
		
		e.setCity("Banglore");
		e.setEmpName("Ram");
		String info1 = e.getEmpDetails();
		System.out.println(info1);

	}

}
