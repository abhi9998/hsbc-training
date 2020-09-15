//Employee class
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Emp {

	private int empId;
	private String empName;
	private String city;
	private double salary;
	
	/**
	 * This method generated an info based on given param
	 * @param empId
	 * @param empName
	 * @param city
	 * @param salary
	 */
	public Emp(int empId,String empName,String city,double salary) {
		this.empId = empId;
		this.empName=empName;
		this.city = city;
		this.salary =salary;
				
	}
	/**
	 * 
	 * @return detailed information of employee.
	 */
	public String getEmpDetails() {
		return empId+" "+empName+" "+city+" "+salary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	/*
	 * public void setEmpName(String empName) { this.empName= empName; }
	 */
}
