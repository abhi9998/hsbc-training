package Question8;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class Student {

	private int studentId;
	private String studentName;
	public Student() {
		
	}
	public Student(int studentId,String studentName) {
		this.studentId= studentId;
		this.studentName = studentName;
	}
	/**
	 * if default constructor is deleted, this initialization which cause
		Unresolved compilation problem: The constructor Student() is undefined
		however is there are no object initialization which empty arguments then default constructor can be
		safely deleted without error
	 * @param args
	 */
	public static void main(String args[]) {
		
		/*if default constructor is deleted, this initialization which cause
		 * Unresolved compilation problem: The constructor Student() is undefined
		 * 
		 * however is there are no object initialization which empty arguments then default constructor can be
		 * safely deleted without error
		 */
		Student s = new Student();
		
		Student s1 = new Student(1,"Abhi");
	}
}
