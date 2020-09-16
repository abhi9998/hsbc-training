
public class Emp {
	
	private int empId;
	private String empName;
	
	public Emp(Emp e) {
		this.empId =e.empId;
		this.empName = e.getEmpName();
	}
	
	public  Emp(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	

}
