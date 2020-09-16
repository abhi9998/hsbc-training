
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpDb db = new EmpDb();
		System.out.println("database have two employees with id 1 and id 2");
		
		
		Emp empAdd =new Emp(3,"Abhi3");
		System.out.println(db.add(empAdd));
		
		
		
		
		Emp empReturn = db.searchOne(3);
		
		if(empReturn==null) {
			System.out.println("No such Emp exists");
		}else {
			System.out.println(empReturn.getEmpName());
		}
		
		System.out.println(db.add(empAdd));
		
		db.findAll();
	}

}
