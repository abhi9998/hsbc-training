
public class EmpDb {
	Emp emp[]= new Emp[10];
	int size;
	public EmpDb() {
		emp[0]= new Emp(1,"Abhi1");
		emp[1]= new Emp(2,"Abhi2");
		this.size=2;
		
	}
	
	public String add(Emp e) {
		
		if(size==10)
			return "No Capacity";
		
		for(int i=0;i<size;i++) {
			if(emp[i].getEmpId()==e.getEmpId()) {
				return "Already Exists with Same ID";
			}
		}
		
		emp[size]=new Emp(e.getEmpId(),e.getEmpName());
		size++;
		return "Added successfully";
	}
	
	public Emp searchOne(int empId) {
		
		for(int i=0;i<size;i++) {
			if(emp[i].getEmpId()==empId) {
				return new Emp(emp[i]);
			}
		}
		return null;
	}
	
	public void findAll() {
			
			for(int i=0;i<size;i++) {
				System.out.println(emp[i].getEmpId()+":"+emp[i].getEmpName());
			}
	}
}
